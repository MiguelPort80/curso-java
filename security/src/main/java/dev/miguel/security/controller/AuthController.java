package dev.miguel.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.miguel.security.config.TokenConfig;
import dev.miguel.security.dto.request.LoginRequest;
import dev.miguel.security.dto.request.RegisterUserRequest;
import dev.miguel.security.dto.response.LoginResponse;
import dev.miguel.security.dto.response.RegisterUserResponse;
import dev.miguel.security.entities.User;
import dev.miguel.security.repository.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final AuthenticationManager authenticationManager;
	private final TokenConfig tokenConfig;
	
	
	
	public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder,
			AuthenticationManager authenticationManager, TokenConfig tokenConfig) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.authenticationManager = authenticationManager;
		this.tokenConfig = tokenConfig;
	}

	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request){
		//autentique esse usuario com esse email e essa senha
		UsernamePasswordAuthenticationToken userAndPass = new UsernamePasswordAuthenticationToken(request.email(),request.password());
		//busca por um UserDetailsService, que definimos no AuthConfig
		Authentication authentication = authenticationManager.authenticate(userAndPass);

		
		User user = (User) authentication.getPrincipal();
		
		String token = tokenConfig.generateToken(user);
		
		return ResponseEntity.ok(new LoginResponse(token));
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<RegisterUserResponse> register(@Valid @RequestBody RegisterUserRequest request){
		User user = new User();
		user.setPassword(passwordEncoder.encode(request.password()));
		user.setEmail(request.email());
		user.setName(request.name());
		
		userRepository.save(user);
		
		return ResponseEntity.status(HttpStatus.CREATED)
			   .body(new RegisterUserResponse(user.getName(),user.getEmail()));
	}
}

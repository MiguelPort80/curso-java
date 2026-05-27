package dev.miguel.security.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.miguel.security.repository.UserRepository;

@Service
public class AuthConfig implements UserDetailsService{
	
	private UserRepository userRepository;
	
	

	public AuthConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findUserByEmail(username).orElseThrow( () -> new UsernameNotFoundException(username) );
	}

}

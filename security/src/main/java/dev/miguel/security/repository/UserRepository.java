package dev.miguel.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import dev.miguel.security.entities.User;
//jpa gera o codigo automaticamente :p
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<UserDetails> findUserByEmail(String username);
}

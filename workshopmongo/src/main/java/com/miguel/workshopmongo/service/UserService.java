package com.miguel.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.workshopmongo.entites.User;
import com.miguel.workshopmongo.repository.UserRepository;
import com.miguel.workshopmongo.service.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}

package com.miguel.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.workshopmongo.entites.User;
import com.miguel.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}

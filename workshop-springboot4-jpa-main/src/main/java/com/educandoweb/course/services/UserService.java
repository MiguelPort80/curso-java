package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entites.User;
import com.educandoweb.course.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	//faz injeção automatica com autowired assim
	/*public UserService(UserRepository repository) {
		this.repository = repository;
	}
	public UserService() {}*/

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User save(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
}

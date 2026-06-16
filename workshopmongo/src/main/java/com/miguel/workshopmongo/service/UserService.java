package com.miguel.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.workshopmongo.dto.UserDTO;
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
	
	public User Insert(User user) {
		return repository.insert(user);
	}
	
	public User fromDTO(UserDTO dto) {
		return new User(dto.getId(), dto.getName(), dto.getEmail());
	}
	
	public void delete(String id) {
		
		findById(id);
		
		repository.deleteById(id);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setId(obj.getId());
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}
	public User update(User obj) {
		User newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}

	
}

package com.miguel.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.workshopmongo.dto.UserDTO;
import com.miguel.workshopmongo.entites.Post;
import com.miguel.workshopmongo.entites.User;
import com.miguel.workshopmongo.repository.PostRepository;
import com.miguel.workshopmongo.repository.UserRepository;
import com.miguel.workshopmongo.service.exceptions.ObjectNotFoundException;

@Service
public class PostService {
	@Autowired
	PostRepository repository;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitleContaining(String text) {
		return repository.searchTitle(text);
	}

	
}

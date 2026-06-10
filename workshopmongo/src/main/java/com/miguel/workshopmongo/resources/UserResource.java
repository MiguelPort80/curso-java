package com.miguel.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.workshopmongo.entites.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1","Maria brown", "mariabrown@gmail.com");
		User daniel = new User("2","Daniel Green", "danielgreen@gmail.com");
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(maria,daniel));
		return ResponseEntity.ok(lista);
	}
}

package com.miguel.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguel.workshopmongo.entites.User;
import com.miguel.workshopmongo.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		List<User> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
}

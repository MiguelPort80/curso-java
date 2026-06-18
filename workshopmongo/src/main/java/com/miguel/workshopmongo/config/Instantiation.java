package com.miguel.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.miguel.workshopmongo.dto.AuthorDTO;
import com.miguel.workshopmongo.dto.CommentsDTO;
import com.miguel.workshopmongo.entites.Post;
import com.miguel.workshopmongo.entites.User;
import com.miguel.workshopmongo.repository.PostRepository;
import com.miguel.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		repository.deleteAll();
		postRepository.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		repository.saveAll(Arrays.asList(maria,alex,bob));

		Post post1 = new Post(null, sdf.parse("10/10/2018"), "Partiu Viagem", "vou viajar para são paulo", new AuthorDTO(alex));
		
		CommentsDTO c1 = new CommentsDTO("Boa viagem mano!", sdf.parse("12/10/2018"), new AuthorDTO(alex));
		
		post1.getComments().add(c1);
		postRepository.save(post1);
		
		maria.getPosts().add(post1);
		repository.save(maria);
		
	}

}

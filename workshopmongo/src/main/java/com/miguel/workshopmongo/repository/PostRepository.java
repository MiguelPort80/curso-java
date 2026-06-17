package com.miguel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miguel.workshopmongo.entites.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}

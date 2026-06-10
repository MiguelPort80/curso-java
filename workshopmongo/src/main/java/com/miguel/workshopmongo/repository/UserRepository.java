package com.miguel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miguel.workshopmongo.entites.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}

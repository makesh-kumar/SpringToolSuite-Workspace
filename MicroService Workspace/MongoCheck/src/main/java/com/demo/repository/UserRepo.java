package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.demo.model.User;

public interface UserRepo extends MongoRepository<User, String>
{

}

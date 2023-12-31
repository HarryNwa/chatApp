package com.harry.chatapp.data.repositories;

import com.harry.chatapp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends MongoRepository<User, String> {

}

package com.Ticketbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ticketbooking.entity.UserRequest;

public interface UserRepository extends MongoRepository<UserRequest, String>{

}

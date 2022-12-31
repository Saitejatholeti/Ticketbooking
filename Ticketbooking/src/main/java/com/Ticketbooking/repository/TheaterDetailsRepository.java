package com.Ticketbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ticketbooking.entity.TheaterDetails;

public interface TheaterDetailsRepository extends MongoRepository<TheaterDetails, String>{

}

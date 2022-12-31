package com.Ticketbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ticketbooking.entity.Cinema;

public interface CinemaRepository extends MongoRepository<Cinema, String>{

}

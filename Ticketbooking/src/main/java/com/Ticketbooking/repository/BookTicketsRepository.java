package com.Ticketbooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Ticketbooking.entity.TicketBooking;

public interface BookTicketsRepository extends MongoRepository<TicketBooking, String>{

}

package com.Ticketbooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ticketbooking.repository.TheaterDetailsRepository;

@Service
public class BookingService {
	
	@Autowired
	private TheaterDetailsRepository bookingRepository;

}

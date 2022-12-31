package com.Ticketbooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ticketbooking.entity.UserRequest;
import com.Ticketbooking.repository.UserRepository;

@Service
public class CategoryService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser(UserRequest userRequest) {
		userRepository.save(userRequest);
		
	}

}

package com.Ticketbooking.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ticketbooking.entity.Cinema;
import com.Ticketbooking.entity.SeatDetails;
import com.Ticketbooking.entity.TheaterDetails;
import com.Ticketbooking.entity.TicketBooking;
import com.Ticketbooking.model.CategoryRequest;
import com.Ticketbooking.model.CinemaRequest;
import com.Ticketbooking.model.CinemaTheaterRequest;
import com.Ticketbooking.repository.BookTicketsRepository;
import com.Ticketbooking.repository.CinemaRepository;
import com.Ticketbooking.repository.TheaterDetailsRepository;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaRepository cinemaRepository;
	
	@Autowired
	private TheaterDetailsRepository theaterDetailsRepository;
	
	@Autowired
	private BookTicketsRepository bookTicketsRepository;
	
	
	
	public void loadCinemaDetails(CinemaRequest cinemaRequest) {
		
		loadCinemas(cinemaRequest);
		loadTheaters(cinemaRequest);
		loadTickets(cinemaRequest);
		
	}


	private void loadTickets(CinemaRequest cinemaRequest) {
		
		List<TicketBooking> ticketBookingList = new ArrayList<>();
		for(CinemaTheaterRequest theater : cinemaRequest.getTheaterList()) {
			TicketBooking ticketBooking = new TicketBooking();
			ticketBooking.setCinemaName(cinemaRequest.getName());
			ticketBooking.setTheaterName(theater.getName());
			ticketBooking.setBookingDate(theater.getDate());
			List<SeatDetails> seatDetailsList = new ArrayList<>();
			for(CategoryRequest categoryRequest : theater.getCategoryList()) {
				for(int i = 'A'; i<'Z'; i++) {
					
					for(int j=1 ; j<=categoryRequest.getSeats(); j++) {
						SeatDetails seatDetails = new SeatDetails();
						seatDetails.setCategory(categoryRequest.getCategoryName());
						seatDetails.setShowTime(theater.getShowTime());
						seatDetails.setRowNumber(String.valueOf(i));
						seatDetails.setSeatNumber(j);
						seatDetailsList.add(seatDetails);
					}
				}
				
				
			}
			ticketBookingList.add(ticketBooking);
		}
		
		if(!ticketBookingList.isEmpty()) {
			bookTicketsRepository.saveAll(ticketBookingList);
		}
	}


	private void loadTheaters(CinemaRequest cinemaRequest) {
		Map<Date, List<String>> theatersMap = new HashMap<>();
		
		cinemaRequest.getTheaterList().forEach(theater -> {
			if(theatersMap.containsKey(theater.getDate())) {
				List<String> theaterNameList = theatersMap.get(theater.getDate());
				theaterNameList.add(theater.getName());
				theatersMap.put(theater.getDate(), theaterNameList);
			}else {
				theatersMap.put(theater.getDate(), Arrays.asList(theater.getName()));
			}
			
		});
		
		
		List<TheaterDetails> theaterDetailsList = new ArrayList<>();
		theatersMap.forEach((key, value) -> {
			TheaterDetails theaterDetails = new TheaterDetails();
			theaterDetails.setAvailableDate(key);
			theaterDetails.setTheaterList(value);
			theaterDetails.setLanguage(cinemaRequest.getLanguage());
			theaterDetails.setName(cinemaRequest.getName());
			theaterDetailsList.add(theaterDetails);
		});
		
		if(!theaterDetailsList.isEmpty()) {
			theaterDetailsRepository.saveAll(theaterDetailsList);
		}
		
	}


	private void loadCinemas(CinemaRequest cinemaRequest) {
		Cinema cinema = new Cinema();
		cinema.setName(cinemaRequest.getName());
		cinema.setLanguage(cinemaRequest.getLanguage());
		cinemaRepository.save(cinema);
		
	}
	

}

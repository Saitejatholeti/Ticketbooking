package com.Ticketbooking.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "ticketBooking")
public class TicketBooking {
	
	@Id
	private String id;
	private Date bookingDate;
	private String cinemaName;
	private String theaterName;
	private List<SeatDetails> seatDetailsList;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<SeatDetails> getSeatDetailsList() {
		return seatDetailsList;
	}
	public void setSeatDetailsList(List<SeatDetails> seatDetailsList) {
		this.seatDetailsList = seatDetailsList;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	
	

}

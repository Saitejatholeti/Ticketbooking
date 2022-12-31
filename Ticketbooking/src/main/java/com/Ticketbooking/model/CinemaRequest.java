package com.Ticketbooking.model;

import java.util.List;

public class CinemaRequest {
	
	private String name;
	private String language;
	private List<CinemaTheaterRequest> theaterList;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public List<CinemaTheaterRequest> getTheaterList() {
		return theaterList;
	}
	public void setTheaterList(List<CinemaTheaterRequest> theaterList) {
		this.theaterList = theaterList;
	}
	

}

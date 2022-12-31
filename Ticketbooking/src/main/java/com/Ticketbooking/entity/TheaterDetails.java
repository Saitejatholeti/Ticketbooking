package com.Ticketbooking.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "theaterInformation")
public class TheaterDetails {
	
	@Id
	private String id;
	private String name;
	private String language;
	private Date availableDate;
	private List<String> theaterList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Date getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public List<String> getTheaterList() {
		return theaterList;
	}
	public void setTheaterList(List<String> theaterList) {
		this.theaterList = theaterList;
	}
	
	
	

}

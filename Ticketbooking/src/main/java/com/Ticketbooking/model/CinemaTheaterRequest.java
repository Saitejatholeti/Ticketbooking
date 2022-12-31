package com.Ticketbooking.model;

import java.util.Date;
import java.util.List;

public class CinemaTheaterRequest {
	
	private String name;
	private Date date;
	private String showTime;
	private List<CategoryRequest> categoryList;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public List<CategoryRequest> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<CategoryRequest> categoryList) {
		this.categoryList = categoryList;
	}
	

	
}

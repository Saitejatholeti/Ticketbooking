package com.Ticketbooking.entity;

public class SeatDetails {
	
	private String category;
	private String showTime;
	private int seatNumber;
	private boolean isAllocated;
	private String rowNumber;
	private boolean isBlocked;
	
	
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isAllocated() {
		return isAllocated;
	}
	public void setAllocated(boolean isAllocated) {
		this.isAllocated = isAllocated;
	}
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public boolean isBlocked() {
		return isBlocked;
	}
	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
	
	
	

}

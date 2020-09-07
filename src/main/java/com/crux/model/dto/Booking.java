package com.crux.model.dto;

public class Booking {
	private String bookingId = "";
	private String sourceLocation = "";
	private String destLocation = "";
	private String satus = "";
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestLocation() {
		return destLocation;
	}
	public void setDestLocation(String destLocation) {
		this.destLocation = destLocation;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", sourceLocation=" + sourceLocation + ", destLocation="
				+ destLocation + ", satus=" + satus + "]";
	}
	
}

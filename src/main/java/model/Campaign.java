package model;

import enumeration.Status;

public class Campaign {
	private String name;
	private String startDate;
	private String endDate;
	private Status state;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Status getState() {
		return state;
	}
	public void setState(Status state) {
		this.state = state;
	}
}

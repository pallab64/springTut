package com.spring_1;

public class Answer {
	
	private String city;  
	private String state;  
	  
	public Answer(){
		
	}
	  
	
	  
	
	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public void print(){
		System.out.println("City"+city);
	}
}

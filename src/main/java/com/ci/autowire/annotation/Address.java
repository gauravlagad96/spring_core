package com.ci.autowire.annotation;


public class Address {
	
	private String city;
	private String village;

	
	

	public Address(String city, String village) {
		this.city = city;
		this.village = village;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", village=" + village + "]";
	}

}

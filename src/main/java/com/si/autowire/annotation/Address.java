package com.si.autowire.annotation;


public class Address {
	
	private String city;
	private String village;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
	

	@Override
	public String toString() {
		return "Address [city=" + city + ", village=" + village + "]";
	}

}
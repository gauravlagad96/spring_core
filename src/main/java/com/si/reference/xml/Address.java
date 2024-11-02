package com.si.reference.xml;

import java.util.List;

public class Address {

	private List<String> city;

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
		
}

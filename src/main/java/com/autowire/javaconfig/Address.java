package com.autowire.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("kolgaon")
	private String city;
	@Value("413728")
	private int pinCode;

//	public Address(String city, int pinCode) {
//		super();
//		this.city = city;
//		this.pinCode = pinCode;
//	}
//	
//
//	public Address() {
//		super();
//	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}

}

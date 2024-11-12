package com.autowire.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("48")
	private int id;
	@Value("Gaurav")
	private String name;

	@Autowired
	private Address address;
//
//	public Student(int id, String name, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//	}
//
//	public Student() {
//		super();
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}

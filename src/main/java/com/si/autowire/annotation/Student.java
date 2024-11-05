package com.si.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private String name;

//	1.autowire with field
	@Autowired
	@Qualifier("address2")
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

// 2.autowire with setter injection
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return " Student [id=" + id + ", name=" + name + ", address=" + address + "] ";
	}

}

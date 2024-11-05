package com.ci.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	private String name;

	private Address address;

	public Student(int id, String name, @Qualifier("address2") Address address) {
		System.out.println("consturctor called..");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return " Student [id=" + id + ", name=" + name + ", address=" + address + "] ";
	}

}

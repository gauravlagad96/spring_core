package com.si.collection.xml;

import java.util.*;

public class Students {

	private String name;
	private List<String> address;
	private Set<String> phone;
	private Map<String, String> courses;

	// toString method magic mehod or diamond method in java present in Object class
	@Override
	public String toString() {
		return "Students [name=" + name + ", address=" + address + ", phone=" + phone + ", courses=" + courses + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhone() {
		return phone;
	}

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}

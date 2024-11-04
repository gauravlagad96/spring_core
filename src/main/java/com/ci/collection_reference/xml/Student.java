package com.ci.collection_reference.xml;

import java.util.List;

public class Student {

	private int id;
	private String name;
	List<String> courses;
	
	private Certificate certificate;
	
	

	public Student(int id, String name, List<String> courses, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.certificate = certificate;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", certificate=" + certificate + "]";
	}
	
	
}

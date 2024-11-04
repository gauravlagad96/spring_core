package com.ci.primitive.xml;

public class Student {
	private int id;
	private String name;
	private String address;
	
	public Student(int id,String name) {
		System.out.println("int ,string constructor called.");
		this.id=id;
		this.name=name;
	}
	
	public Student(String name,int id) {
		System.out.println("String ,id constructor called.");
		this.id=id;
		this.name=name;
	}
	
	
	public Student(String name,String address) {
		System.out.println("string ,string constructor called.");
		this.name=name;
		this.address= address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	
}

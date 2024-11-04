package com.bean.lifecycle.xml;

public class Student {

	private int id;
	private String name;

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void init() {
		System.out.println("init call: Initilization started");
	}

	public void destroy() {
		System.out.println("destroy call: Destroy Object");
	}

}
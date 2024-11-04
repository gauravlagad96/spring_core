package com.bean.lifecycle_interface.xml;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

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

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy objects");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initilizing objects");
	}

//	public void init() {
//		System.out.println("init call: Initilization started");
//	}
//
//	public void destroy() {
//		System.out.println("destroy call: Destroy Object");
//	}

}

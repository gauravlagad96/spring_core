package com.si.collection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/si/collection/xml/config.xml");
		Students student1= context.getBean("student1",Students.class);
		System.out.println(student1);
	}

}

package com.ci.primitive.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/ci/primitive/xml/config.xml");
		
		Student s =context.getBean("student1",Student.class);
		System.out.println(s);
	}
}

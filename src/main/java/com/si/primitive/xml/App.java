package com.si.primitive.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/si/primitive/xml/config.xml");
		Student s1 = context.getBean("st1", Student.class);
		System.out.println(s1);

	}
}

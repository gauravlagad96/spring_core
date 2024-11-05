package com.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {
	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/xml/config.xml");
	Student s = context.getBean("student",Student.class);
	System.out.println(s);
	}
}

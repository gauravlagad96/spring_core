package com.si.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/si/autowire/annotation/config.xml");
		Student s = context.getBean("student", Student.class);
		System.out.println(s);
		
	}
}

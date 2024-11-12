package com.autowire.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Address ad = context.getBean("address", Address.class);
		System.out.println(ad);
		Student s1 = context.getBean("student", Student.class);
		System.out.println(s1);
	}
	
}
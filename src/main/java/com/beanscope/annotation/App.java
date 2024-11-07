package com.beanscope.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanscope/annotation/config.xml");
		Employee e1 = context.getBean("employee", Employee.class);
		System.out.println("hashcode of obj 1 " +e1.hashCode());
		
		Employee e2 = context.getBean("employee", Employee.class);
		System.out.println("hashcode of obj 2 " + e2.hashCode());
	}

}

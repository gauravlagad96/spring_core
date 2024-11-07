package com.sterotype.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sterotype/xml/config.xml");
		Employee e = context.getBean("employee", Employee.class);
		System.out.println(e);

	}

}

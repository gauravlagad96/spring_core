package com.ci.collection_reference.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/ci/collection_reference/xml/config.xml");
		
		Student s= applicationContext.getBean("student",Student.class);
		System.out.println(s);
		
	}

}

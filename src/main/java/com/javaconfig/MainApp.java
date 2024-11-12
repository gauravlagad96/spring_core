package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee e1 = context.getBean("employee", Employee.class);
		Employee e2 = context.getBean("getEmp", Employee.class);
		// two way two configure java based configuration. 1. method level and component
		// annotaion at class.
		System.out.println(e1);
		System.out.println(e2);
	}

}

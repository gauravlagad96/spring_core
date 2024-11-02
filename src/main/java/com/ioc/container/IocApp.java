package com.ioc.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/gl/ioc/container/config.xml");
		Ram ram=context.getBean("ram",Ram.class);
		System.out.println(ram);
		ram.eat();
		ram.sleep();
		System.out.println("--------------------------------------------");
		Shyam shyam=context.getBean("shyam",Shyam.class);
		shyam.eat();
		shyam.sleep();
		
	}
}

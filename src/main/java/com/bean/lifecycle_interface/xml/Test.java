package com.bean.lifecycle_interface.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ci.collection_reference.xml.App;

public class Test {
	
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/bean/lifecycle/xml/config.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/bean/lifecycle_interface/xml/config.xml");
		context.registerShutdownHook();// for destroy objects.
		Student s=context.getBean("student",Student.class);
		System.out.println(s);
		
		
	}

}

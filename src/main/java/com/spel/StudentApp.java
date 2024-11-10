package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class StudentApp {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spel/config.xml");
		Student st=context.getBean("student",Student.class);
		System.out.println(st);
		
		System.out.println(st.andCheck);
		System.out.println(st.orCheck);
		
		System.out.println("calling static variable of nay class : " + st.num);
		System.out.println(st.data);
		
		SpelExpressionParser expressionParser = new SpelExpressionParser();
		 org.springframework.expression.Expression ex=expressionParser.parseExpression(" 'helloword' ");
		 System.out.println(ex.getValue());
	}

}

package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{2+3}")
	public int sum;

	@Value("#{3-2}")
	public int sub;

	@Value("#{2*3}")
	public int mul;

	@Value("#{4/2}")
	public int div;
	
	
	@Value("#{3>4}")
	public boolean equal;
	
	@Value("#{4 ge 4}")
	public boolean gtequal;
	
	@Value("#{4>=4 && 4<3}")
	public boolean andCheck;

	@Value("#{4>=4 || 4<3}")
	public boolean orCheck;

//	call any static variable 
	@Value("#{T(java.lang.Math).PI}")
	public int num;
	
	public static void call() {
		System.out.println("call method");
	}
	
	
	@Value("#{T(com.spel.Student).call()}")
	public String data;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equal=" + equal
				+ ", gtequal=" + gtequal + "]";	
	}
}
	
	



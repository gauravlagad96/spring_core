package com.ioc.container;

public class Ram implements Action  {

	@Override
	public void eat() {
System.out.println("ram eation");		
	}

	@Override
	public void sleep() {
System.err.println("ram sleeping ");		
	}
	

}

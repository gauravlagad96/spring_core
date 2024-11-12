package com.autowire.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "com.autowire.javaconfig")
public class Config {

	@Bean
	@Primary
	public Address address() {
		return new Address();
	}

	@Bean(name = { "address2" })
	public Address address1() {
		return new Address();
	}

	@Bean
	public Student student() {
		return new Student();
	}

}

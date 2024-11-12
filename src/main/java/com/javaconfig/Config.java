package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javaconfig") // no need when use @Bean in config class.
public class Config {

	@Bean
	public Employee getEmp() {
		return new Employee();
	}

}

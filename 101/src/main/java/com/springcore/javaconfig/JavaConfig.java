package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//works as team lead using component 
@Configuration
@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	// can use any name from these
	@Bean(name= {"student","member","temp"})
	public Student getStudent() {
		Student student = new Student();
		return student;
	}

}

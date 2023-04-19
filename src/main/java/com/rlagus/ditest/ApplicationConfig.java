package com.rlagus.ditest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		Student student1 = new Student("조조",43,168,83);
		
		return student1;		
	}
	
	@Bean
	public Student student2() {
		
		Student student2 = new Student("유비",41,171,76);
		
		return student2;		
	}
	
}

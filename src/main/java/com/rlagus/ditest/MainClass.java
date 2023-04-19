package com.rlagus.ditest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// 컨테이너 생성
		
		Student stu1 = ctx.getBean("student2",Student.class);
		stu1.getClass();
		System.out.println(stu1);
	}

}

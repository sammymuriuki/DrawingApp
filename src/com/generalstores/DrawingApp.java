package com.generalstores;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext();
		HelloWorld obj = (HelloWorld) context.getBean("Hello World");
		obj.getMessage();
		
	}
	
}

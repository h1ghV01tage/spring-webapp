package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMainTomato {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("tomato.xml");
		Tomato redtomato = (Tomato) context.getBean("redtomato");
		System.out.println(redtomato);
		
		Tomato greentomato = (Tomato) context.getBean("greentomato");
		System.out.println(greentomato);
		
	}
	
}

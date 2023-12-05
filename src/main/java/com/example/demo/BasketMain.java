package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("tomato.xml");
		
		Basket basket = (Basket) context.getBean("tombasket");
		System.out.println(basket);
		
	}
	
}

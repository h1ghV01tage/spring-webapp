package com.example.beanery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("foodBean")
public class FoodService {

	@Autowired //Hey Spring container, go and fetch this bean and set here
	private FoodDao foodDao;
	
	public void gcp() {
		
		System.out.println("Connecting to GCP");
	}
	
	public void aws() {
		
		System.out.println("Connecting to AWS");
	}
	
	public void azure() {
		
		System.out.println("Connecting to AZURE");
		Dog dog = new Dog();
		dog.setColor("white");
		dog.setName("big dog");
		foodDao.save(dog);
	}
	
}

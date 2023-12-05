package com.example.beanery;

import org.springframework.stereotype.Repository;

@Repository
public class FoodDao {

	public void save(Dog dog) {
		
		System.out.println("saving dog inside db " + dog );
		
		
	}
	
	
	
}

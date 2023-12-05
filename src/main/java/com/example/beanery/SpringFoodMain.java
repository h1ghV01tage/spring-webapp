package com.example.beanery;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFoodMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("food-service.xml");
		FoodService fs = (FoodService) context.getBean("foodBean");
		fs.aws();
		fs.gcp();
		fs.azure();
		
		//scope of the bean: it is singleton
		FoodService fs1 = (FoodService) context.getBean("foodBean");
		FoodService fs2 = (FoodService) context.getBean("foodBean");
		
		//comparing the reference of the object
		if(fs1 == fs2) {
			
			System.out.println("same");
			
		}
		
	}
		
}


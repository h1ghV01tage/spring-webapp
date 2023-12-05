package com.example.demo;

public class Tomato {

	private String color;
	private int price;
	private String description;
	
	public Tomato() {}
	
	public Tomato(String color, int price, String description) {
		super();
		this.color = color;
		this.price = price;
		this.description = description;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Tomato [color=" + color + ", price=" + price + ", description=" + description + "]";
	}
	
	
}

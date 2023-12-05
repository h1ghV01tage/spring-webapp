package com.example.demo;

public class Basket {

	private int bid;
	private String brand;
	private String description;
	private Tomato tomato;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Tomato getTomato() {
		return tomato;
	}
	public void setTomato(Tomato tomato) {
		this.tomato = tomato;
	}
	@Override
	public String toString() {
		return "Basket [bid=" + bid + ", brand=" + brand + ", description=" + description + ", tomato=" + tomato + "]";
	}
	
	
	
}

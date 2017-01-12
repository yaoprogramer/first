package com.it18zhang.collection.demo;

public class Dog {
	String color;
	int weight;
	String category;
	
	
	public Dog(String color, int weight, String category) {
//		super();
		this.color = color;
		this.weight = weight;
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return category+":"+color+":"+weight+":"+hashCode();
	}
}

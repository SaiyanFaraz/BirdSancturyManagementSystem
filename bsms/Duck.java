package com.bl.bsms;

public class Duck extends Bird {
	
	public void eat() {
		System.out.println("Duck eats Worms");
	}
	
	public void fly() {
		System.out.println("Ducks can fly");
	}
	
	public void swim() {
		System.out.println("Ducks can swim");
	}
	
	public Duck() {
		color = color.WHITE;
		name = "duck";
	}
}

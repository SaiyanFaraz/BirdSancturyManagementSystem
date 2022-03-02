package com.bl.bsms;

public class Ostrich extends Bird {

	
	public void eat() {
		System.out.println("Ostrich eats Worms");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
	public Ostrich() {
		color = color.BLACK;
		name = "Ostrich";
	}
	
}

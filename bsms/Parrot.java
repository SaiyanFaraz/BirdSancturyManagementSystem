package com.bl.bsms;

public class Parrot extends Bird{
	
	public void eat() {
		System.out.println("Parrot eats Chilli");
	}
	
	public void fly() {
		System.out.println("Parrot can fly");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
	public Parrot() {
		color = color.GREEN;
		name = "parrot";
	}
	
	
}

package com.bl.bsms;

public class Penguine extends Bird{
	
	public void eat() {
		System.out.println("Penguine can eat");
	}
	
	public void fly() {
		System.out.println("Penguine can fly");
	}
	
	public void swim() {
		System.out.println("Penguine can swim");
	}
	
	public Penguine() {
		color = color.BLACK_WHITE;
		name = "Penguine";	
		}
}

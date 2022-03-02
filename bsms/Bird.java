package com.bl.bsms;

public abstract class Bird {
	
	enum Color{GREEN, RED, WHITE, BLACK, BLACK_WHITE, PURPLE, ORANGE, BLUE}
	
	Color color;
	String name;
	
	@Override
	public String toString() {
		return "Bird [color=" + color + ", name=" + name + "]";
	}

	abstract public void eat();
	
	abstract public void fly();
	
	abstract public void swim();
}

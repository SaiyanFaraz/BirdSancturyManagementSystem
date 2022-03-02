package com.bl.bsms;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	
	public void printBird(ArrayList<Bird> birdList) {
		for(Bird bird : birdList) {
			System.out.println(bird);
		}
	}
	
	public int showMainMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an option");
		System.out.println("Press 1 to add the bird");
		System.out.println("Press 2 to remove the bird");
		System.out.println("Press 3 to update the bird");
		System.out.println("Press 4 to Print all birds");
		System.out.println("Press 5 to exit the menu");
		
		int option = input.nextInt();
		return option;
	}
}


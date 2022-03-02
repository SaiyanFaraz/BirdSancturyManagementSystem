package com.bl.bsms;

import java.util.ArrayList;
import java.util.Scanner;

//import com.bl.bsms.Bird.Color;

public class Main {
	UserInterface ui = new UserInterface();
	BirdReporisotary birdRepository = new BirdReporisotary();
	
	public static void main(String[] args) {
		System.out.println("Welcome to Bird Santuary");
//		Parrot parrot = new Parrot();
//		Penguine penguine = new Penguine();		
//		Duck duck = new Duck();
//		Ostrich ostrich = new Ostrich();
//		
//		BirdReporisotary birdRepository = new BirdReporisotary();
//		
//		birdRepository.addBird(parrot);
//		birdRepository.addBird(duck);
//		birdRepository.addBird(penguine);
//		birdRepository.addBird(ostrich);
//		
//		birdRepository.removeBird(ostrich);
//		
//		UserInterface ui = new UserInterface();
//		ArrayList birdList = birdRepository.getBirdList();
//		ui.printBird(birdList);
		
		int option = 0;
		
		Main main = new Main();
		while(option != 5) {
		option = main.ui.showMainMenu();
		main.handleUserSelection(option);
		}
		System.out.println("Good Bye");
	}
	
	public void handleUserSelection(int option) {

		switch (option) {
		case 1: 
			addBird();
			break;
		case 2:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Bird name");
			String name = sc.next();
			Bird birdName = birdRepository.getBird(name);
			
			birdRepository.removeBird(birdName);
			
			break;
		case 3:
			break;
		case 4:
			ArrayList birdList = birdRepository.getBirdList();
			ui.printBird(birdList);
			break;
		case 5:
			break;
		default:
			System.out.println("Choose Correct option");
		}
	}
	
	public void addBird() {
		Parrot parrot = new Parrot();
		Penguine penguine = new Penguine();		
		Duck duck = new Duck();
		Ostrich ostrich = new Ostrich();

		birdRepository.addBird(parrot);
		birdRepository.addBird(duck);
		birdRepository.addBird(penguine);
		birdRepository.addBird(ostrich);
	}
}

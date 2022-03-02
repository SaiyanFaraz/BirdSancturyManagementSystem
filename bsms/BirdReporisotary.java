package com.bl.bsms;

import java.util.ArrayList;

//Data Layer
public class BirdReporisotary {
		
	private ArrayList<Bird> birdList = new ArrayList();
	
	public ArrayList getBirdList() {
		return birdList;
	}
	
	public void addBird(Bird bird) {
		birdList.add(bird);		
	}
	
//	Remove functions
	
	public void removeBird(Bird bird) {
		birdList.remove(bird);		
	}

//
	public Bird getBird(String name) {
		for(Bird bird : birdList) {
			 if(bird.name.equals(name) ) {
				 return bird;
			 }
		}
		return null;
	}
}
	
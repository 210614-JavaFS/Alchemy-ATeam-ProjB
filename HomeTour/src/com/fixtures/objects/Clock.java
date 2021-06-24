package com.fixtures.objects;

import java.time.LocalDateTime;   
import com.fixtures.Fixture;

public class Clock extends Fixture implements Interactive {

//	public Clock(String name, String shortDescription, String longDescription) {
//		super(name, shortDescription, longDescription);
//		
//		name = "Wall Clock";
//		shortDescription = "Clock shows the time of the world";
//		longDescription="";
//	}
	
	public Clock()
	{
		super("Wall Clock", 
				"Exits\n North: TV is Boardcasting abc news\n West: Exit to hallway\n South:Exit Dorn ", 
				" The front wall of living Room showing  an Ancient Clock that ring on every hour."+ 
				"On the North of it the Tv drawer where TV Show is casting"+"On the South, There is a nice and soft Couch "+
				"on the West there is exit for the hallway ");
	}

	@Override
	public void interactWith() {

		System.out.println("print current Time");
		this.setLongDescription("Set clock long description here");
		
	}
	public void showTime() {
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(now);
	}

}

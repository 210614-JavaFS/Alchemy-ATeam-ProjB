package com.fixtures.objects;

import java.time.LocalDateTime;

import com.fixtures.Fixture;

public class Television extends Fixture implements Interactive{

	@Override
	public void interactWith() {
		System.out.println("print current TV channel");
		this.setLongDescription("Set News");		
	}
	 public Television()
	{
		super("Wall Clock", 
				"Exits\n North: TV is Boardcasting abc news\n West: Exit to hallway\n South:Exit Dorn ", 
				" The front wall of living Room showing  an Ancient Clock that ring on every hour."+ 
				"On the North of it the Tv drawer where TV Show is casting"+"On the South, There is a nice and soft Couch "+
				"on the West there is exit for the hallway ");
	}
	public void showTV() {
		
		 System.out.println("On TV, ABC news are Broadcasting");
	}

}

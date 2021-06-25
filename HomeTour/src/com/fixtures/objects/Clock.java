package com.fixtures.objects;

import java.time.LocalDateTime; 
import com.fixtures.Fixture;

public class Clock extends Fixture implements Interactive {
	
	public Clock()
	{

		super("WallClock", 
				"A round wall clock", 

				" The front wall of living Room showing  an Ancient Clock that ring on every hour."+ 
				"On the North of it the Tv drawer where TV Show is casting"+"On the South, There is a nice and soft Couch "+
				"on the West there is exit for the hallway ");
	}

	@Override
	public void interactWith() {

		LocalDateTime now = LocalDateTime.now();  

		 System.out.println("The Time is Currently" + now + "\n");
		//this.setLongDescription("Set clock long description here");

		
	}

}

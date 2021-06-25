package com.fixtures.objects;

import com.fixtures.Fixture;

public class Couch extends Fixture implements Interactive{
	
	public Couch()
	{
		super("Couch", 
				"Exits\n South: TV is Boardcasting\n East: Exit to hallway\n West:Wall Clock ", 
				" The front wall of living Room showing  an Ancient Clock that ring on every hour."+ 
				"On the North of it the Tv drawer where TV Show is casting"+"On the South, "+
				"on the West there is exit for the hallway ");
	}
	
	
	@Override
	public void interactWith() {
		System.out.println("You are sitting on the Couch");
	}
}

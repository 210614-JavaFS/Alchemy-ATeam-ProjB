package com.fixtures.objects;

import com.fixtures.Fixture;

public class Couch extends Fixture implements Interactive{
	
	public Couch()
	{
		super("Couch", 
				"Exits\n North: TV is Boardcasting abc news\n West: Exit to hallway\n South:Wall Clock ", 
				" The front wall of living Room showing  an Ancient Clock that ring on every hour."+ 
				"On the North of it the Tv drawer where TV Show is casting"+"On the South, "+
				"on the West there is exit for the hallway ");
	}
	
	
	@Override
	public void interactWith() {
		// TODO Auto-generated method stub
		
	}
	public void Print () {
		System.out.println("I'm Couch");
	}

}

package com.fixtures.rooms;

import com.fixtures.objects.Closet;

public class BedroomT extends Room{
	

	public Closet closet = new Closet("Closet", "A big closet", "A big closet with stuff in it", 10);
	public BedroomT() {
		super("BedroomA", "A nice looking bed room", "A nice neat bedroom with a closet of clothes");
		
	}

	@Override 
	public String objectName() {
		return closet.getName();
	}
	
	@Override
	public void interaction() {
		closet.interactWith();
	}
	
	public String objDesc() {
		return closet.getLongDescription();
	}
		
	public void objInteract() {
		closet.interactWith();

	}
	

	 public String objDesc() {
			return closet.getLongDescription();
		}
		
		public void objInteract() {
			closet.interactWith();
		}

	
}

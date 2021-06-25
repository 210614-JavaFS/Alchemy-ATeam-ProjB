package com.fixtures.rooms;

import com.fixtures.objects.Closet;

public class BedroomT extends Room{
	
	Closet closet = new Closet("Master Closet", "Closet in Bedroom-A","This closet is 4 by 6 feet and is painted greay with dim ligts"  , 15);

	public BedroomT(String name, String shortDescription, String longDescription) {
		super("Bedroom-A", "This is the master bedroom", "Master Bedroom with all the amenities in the house");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String objectName() {
		
		return closet.getName();
	}

	@Override
	public void interaction() {
		
		closet.interaction();
	}
	

	 public String objDesc() {
			return closet.getLongDescription();
		}
		
		public void objInteract() {
			closet.interactWith();
		}

}

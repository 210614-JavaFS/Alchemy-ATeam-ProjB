package com.fixtures.rooms;

import com.fixtures.objects.Toilet;

public class Bathroom extends Room {

	Toilet toilet = new Toilet("Toilet","Small Toilet", "it's a Toilet what else is there to know?");

	public Bathroom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	@Override 
	public String objectName() {
		return toilet.getName();
	}
	
	@Override
	public void interaction() {
		toilet.interactWith();
	}
	
	public String objDesc() {
		return toilet.getLongDescription();
	}
		
	public void objInteract() {
		toilet.interactWith();
	}

	
}

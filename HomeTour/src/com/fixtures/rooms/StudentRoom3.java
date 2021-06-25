package com.fixtures.rooms;

import com.fixtures.objects.Matress;

public class StudentRoom3 extends Room
{
	Matress mattress = new Matress();
	
	public StudentRoom3() {

		super("BedroomB", "A small expensive room", "You are in a small expensive room with a blue mattress that takes up each corner of the room...yeah..welcome to California");

	}	
	
	@Override 
	public String objectName() {
		return mattress.getName();
	}
	
	@Override
	public void interaction() {
		mattress.interactWith();
	}
	
	public String objDesc() {
		return mattress.getLongDescription();
	}
		
	public void objInteract() {
		mattress.interactWith();
	}

}

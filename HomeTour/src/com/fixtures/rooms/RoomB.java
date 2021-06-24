package com.fixtures.rooms;

import com.fixtures.objects.Computer;

public class RoomB extends Room {
	
	Computer pc = new Computer();

	public RoomB() {
		super("RoomB", "A gamer room.\n", 
				"A small dark disorganized room with the most basic things to live in with some posters,"
				+ " except for the electronics. \n"
				+ "In one corner is the bed with drawers under it." 
				+ " In front of the bed is a desk with a TV and a monitor, there are videogames\n"
				+ "consoles and a computer around them. On the other side of the room is there \n"
				+ "is a shelf with books and a guitar next to it. ");
	}
	
	@Override 
	public String objectName() {
		return pc.getName();
	}
	
	@Override
	public void interaction() {
		pc.interactWith();
	}
		public String objDesc() {
			return pc.getLongDescription();
		}
		
		public void objInteract() {
			pc.interactWith();
		}
}

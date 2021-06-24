package com.fixtures.rooms;

import java.util.ArrayList;

import com.fixtures.Fixture;

public class Room extends Fixture {

	private ArrayList<Room> exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new ArrayList<Room>();
	}

	public ArrayList<Room> getExits() {
		return exits;
	}

	public void setExits(ArrayList<Room> exits) {
		this.exits = exits;
	}

	// method returns Room becuase it will return one room which will be the Room
	// that the user wants to exit.
	public Room getExit(String roomName) {

		Room exitRoom = this;
		Room tempRoom;
		//System.out.println("hey");
		for (int i = 0; i < exits.size(); i++) {
			tempRoom = exits.get(i);

			if (tempRoom.getName().equals(roomName) == true) {
				exitRoom = tempRoom;
			}
			}
		 if (exitRoom == this) {
				System.out.println("\nThis room does not have that exit.\n");
				System.out.println("List of Exits:");
				for(int j = 0; j<this.getExits().size(); j++)
				{
					System.out.println(this.getExits().get(j).getName());
				}

		}
		return exitRoom;

	}

}

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

		Room exitRoom = null;
		Room tempRoom;

		for (int i = 0; i < exits.size(); i++) {
			tempRoom = exits.get(i);

			if (tempRoom.getName().equals(roomName) == true) {
				exitRoom = tempRoom;
			}

			if (exitRoom == null) {
				System.out.println("This room does not have that exit.");
			}

		}
		return exitRoom;
	}

}

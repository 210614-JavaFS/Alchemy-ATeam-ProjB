package com.game;

import java.util.ArrayList;

import com.fixtures.rooms.Bathroom;
import com.fixtures.rooms.Room;

public class RoomManager {

	public Room startingRoom;
	public ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {

		// Creations of all the rooms of the game and add their respective exits.

		Room livingRoom = new Room("LivingRoom", "The living room of the college dorm",
				"This is the living room of a college dorm apartment that lives 4 students"); // Generic Description.
																								// Will change

		Bathroom bathroom = new Bathroom("Bathroom",
				"This is the bathroom of Student1 and Student2", "This will be longer eventually Need to change it");

		ArrayList<Room> bathroom1Exits = new ArrayList<Room>();
		bathroom1Exits.add(livingRoom);
		bathroom.setExits(bathroom1Exits);
		
		ArrayList<Room> livingRoomExits = new ArrayList<Room>();
		livingRoomExits.add(bathroom);
		livingRoom.setExits(livingRoomExits);

		startingRoom = livingRoom;
	}
}

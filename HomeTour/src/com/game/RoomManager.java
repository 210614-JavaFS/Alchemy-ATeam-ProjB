package com.game;

import java.util.ArrayList;

import com.fixtures.rooms.Bathroom;
import com.fixtures.rooms.Kitchen;
import com.fixtures.rooms.Room;
import com.fixtures.rooms.StudentRoom3;
import com.fixtures.rooms.RoomB;

public class RoomManager {

	public Room startingRoom;
	public ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {

		// Creations of all the rooms of the game and add their respective exits.

		Room livingRoom = new Room("LivingRoom", "The living room of the college dorm",
				"This is the living room of a college dorm apartment that lives 4 students"); // Generic Description.
																								// Will change
		ArrayList<String> stove = new ArrayList<String>();
		stove.add("Pot");
		stove.add("Pan");
		Kitchen kitchen = new Kitchen("Kitchen", "The kichen of the college dorm", "This is the kitchen of a 4 person college dorm apartment.", stove );
		Bathroom bathroom = new Bathroom("Bathroom",
				"This is the bathroom of Student1 and Student2", "This will be longer eventually Need to change it");

		StudentRoom3 studentRoom3 = new StudentRoom3("StudentRoom3", "A blue matress that takes up the small expensive room", "A blue matress that takes up the small expensive room");
		RoomB roomB = new RoomB();
		
		ArrayList<Room> bathroom1Exits = new ArrayList<Room>();
		bathroom1Exits.add(livingRoom);
		bathroom.setExits(bathroom1Exits);
	
		
		ArrayList<Room> studentRoom3Exits = new ArrayList<Room>();
		studentRoom3Exits.add(livingRoom);
		studentRoom3.setExits(studentRoom3Exits);
	
		ArrayList<Room> livingRoomExits = new ArrayList<Room>();
		livingRoomExits.add(bathroom);
		livingRoomExits.add(studentRoom3);
		livingRoomExits.add(kitchen);
		livingRoom.setExits(livingRoomExits);
		

		ArrayList<Room> kitchenExits = new ArrayList<Room>();
		kitchenExits.add(livingRoom);
		kitchen.setExits(kitchenExits);
		

		ArrayList<Room> roomBExits = new ArrayList<Room>();
		roomBExits.add(livingRoom);
		roomB.setExits(roomBExits);


		startingRoom = livingRoom;
	}
}

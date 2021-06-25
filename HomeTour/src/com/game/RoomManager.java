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

		Room hallway = new Room("Hallway", "Exits:\nEast: Kitchen\nNorth: Bedroom\nSouth: Living Room\nWest: Bathroom",
				"Long Description of Hallway");
		Room livingRoom = new Room("Livingroom",
				"Items: \nwall clock\nTelevision\nCouch\n\nExits:\nEast: An ancient clock is hanging on the wall\nNorth: ABC news are broadcasting on Television\nSouth: Comfortable Couch with coffee table\nWest: Exits to Hallway",
				"Long Description of Living room");

		ArrayList<String> stove = new ArrayList<String>();
		stove.add("Pot");
		stove.add("Pan");
		Kitchen kitchen = new Kitchen("Kitchen", "The kichen of the college dorm",
				"This is the kitchen of a 4 person college dorm apartment.", stove);
		Bathroom bathroom = new Bathroom("Bathroom", "This is the bathroom of Student1 and Student2",
				"This will be longer eventually Need to change it");

		StudentRoom3 studentRoom3 = new StudentRoom3();
		RoomB roomB = new RoomB();

		ArrayList<Room> bathroom1Exits = new ArrayList<Room>();
		bathroom1Exits.add(hallway);
		bathroom.setExits(bathroom1Exits);

		ArrayList<Room> studentRoom3Exits = new ArrayList<Room>();
		studentRoom3Exits.add(hallway);
		studentRoom3.setExits(studentRoom3Exits);

		ArrayList<Room> kitchenExits = new ArrayList<Room>();
		kitchenExits.add(hallway);
		kitchen.setExits(kitchenExits);

		ArrayList<Room> roomBExits = new ArrayList<Room>();
		roomBExits.add(hallway);
		roomB.setExits(roomBExits);

		startingRoom = livingRoom;

	}
}

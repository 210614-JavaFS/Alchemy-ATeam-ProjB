package com.game;

import java.util.ArrayList;

import com.fixtures.rooms.Bathroom;


import com.fixtures.rooms.BedroomT;
import com.fixtures.rooms.Hallway;
import com.fixtures.rooms.Kitchen;
import com.fixtures.rooms.LivingRoom;


import com.fixtures.rooms.Room;
import com.fixtures.rooms.StudentRoom3;
import com.fixtures.rooms.RoomB;

public class RoomManager {

	public Room startingRoom;
	public ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {

		// Creations of all the rooms of the game and add their respective exits.


		BedroomT bedroomA = new BedroomT();
		Hallway hallway = new Hallway("Hallway", 
				"Hallway", 
				"A short hallway");
		LivingRoom livingRoom = new LivingRoom("Livingroom",
				"A cozy room for all of your roommates can chill.",
				"On the East: You see an ancient clock is hanging on the wall\nOn the North: You see ABC news are broadcasting on Television\nOn the South: A Comfortable Couch with coffee table\nOn the West: Exits to Hallway");

		
		
		rooms.add(hallway);
		rooms.add(livingRoom);
		
		startingRoom = hallway;
		
		ArrayList<Room> hallwayExits = new ArrayList<Room>();
		ArrayList<Room> livingRoomExits = new ArrayList<Room>();

		ArrayList<Room> bedroomAExits = new ArrayList<Room>();
		
		bedroomAExits.add(livingRoom);
		bedroomA.setExits(bedroomAExits);

		
		hallwayExits.add(livingRoom);
		
		
		hallway.setExits(hallwayExits);
		livingRoom.setExits(livingRoomExits);

		ArrayList<String> stove = new ArrayList<String>();
		stove.add("Pot");
		stove.add("Pan");
		Kitchen kitchen = new Kitchen("Kitchen", "The kichen of the college dorm", "This is the kitchen of a 4 person college dorm apartment.", stove );
		Bathroom bathroom = new Bathroom("Bathroom",
				"This is the bathroom of Student1 and Student2", "This will be longer eventually Need to change it");

		StudentRoom3 studentRoom3 = new StudentRoom3();
		RoomB roomB = new RoomB();
		
		ArrayList<Room> bathroom1Exits = new ArrayList<Room>();
		bathroom1Exits.add(hallway);
		bathroom.setExits(bathroom1Exits);
	
		
		ArrayList<Room> studentRoom3Exits = new ArrayList<Room>();
		studentRoom3Exits.add(hallway);
		studentRoom3.setExits(studentRoom3Exits);
	

		livingRoomExits.add(bathroom);
		livingRoomExits.add(hallway);
		livingRoomExits.add(studentRoom3);
		livingRoomExits.add(kitchen);
		livingRoomExits.add(roomB);

		livingRoomExits.add(bedroomA);


		livingRoom.setExits(livingRoomExits);
		
		ArrayList<Room> bedroomAexits = new ArrayList<Room>();
		bedroomAexits.add(livingRoom);
		bedroomAexits.add(bathroom);
		bedroom.setExits(bedroomAexits);
		


		ArrayList<Room> kitchenExits = new ArrayList<Room>();
		kitchenExits.add(hallway);
		kitchen.setExits(kitchenExits);
		

		ArrayList<Room> roomBExits = new ArrayList<Room>();
		roomBExits.add(hallway);
		roomB.setExits(roomBExits);


		startingRoom = livingRoom;


	}
}

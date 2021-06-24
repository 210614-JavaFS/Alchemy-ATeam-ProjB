package com.game;

import java.util.ArrayList;

import com.fixtures.rooms.Bathroom;
import com.fixtures.rooms.Hallway;
import com.fixtures.rooms.LivingRoom;
import com.fixtures.rooms.Room;

public class RoomManager {

	public Room startingRoom;
	public ArrayList<Room> rooms = new ArrayList<Room>();

	public void init() {

		// Creations of all the rooms of the game and add their respective exits.
		
		Room hallway = new Room("Hallway", 
				"Exits:\nEast: Kitchen\nNorth: Bedroom\nSouth: Living Room\nWest: Bathroom", 
				"Long Description of Hallway");
		Room livingRoom = new Room("Livingroom",
				"Items: \nwall clock\n\nExits:\nEast: An ancient clock is hanging on the wall\nNorth: ABC news are broadcasting on Television\nSouth: Comfortable Couch with coffee table\nWest: Exits to Hallway",
				"Long Description of Living room");
		
		rooms.add(hallway);
		rooms.add(livingRoom);
		
		startingRoom = hallway;
		
		ArrayList<Room> hallwayExits = new ArrayList<Room>();
		ArrayList<Room> livingRoomExits = new ArrayList<Room>();
		
		livingRoomExits.add(hallway);
		hallwayExits.add(livingRoom);
		
		
		hallway.setExits(hallwayExits);
		livingRoom.setExits(livingRoomExits);
	}
}

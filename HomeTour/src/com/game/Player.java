package com.game;

import com.fixtures.rooms.Room;

public class Player {

	Room currentRoom;

	public Player(Room currentRoom) {
		super();
		this.currentRoom = currentRoom;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

}

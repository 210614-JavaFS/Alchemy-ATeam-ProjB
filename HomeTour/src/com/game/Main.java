package com.game;

import java.util.Scanner;

import com.fixtures.objects.*;
import com.fixtures.rooms.LivingRoom;
import com.fixtures.rooms.Room;

public class Main {

	static RoomManager manager;
	public static void main(String[] args) {


		manager = new RoomManager();

		
				
		RoomManager manager = new RoomManager();

		manager.init();
		Player player = new Player(manager.startingRoom);

		// While condition will change. set to true during development
		while (true) {
			System.out.println("You're in "  + player.getCurrentRoom().getName());
			System.out.println("\n\n" + player.getCurrentRoom().getLongDescription());
			System.out.println("\nItems to interact with \n");
			if(player.getCurrentRoom().getInteractive() != null) {
				for(int i = 0; i<player.getCurrentRoom().getInteractive().size(); i++) {
					System.out.println(player.getCurrentRoom().getInteractive().get(i).toString());
				}				
			}else {
				System.out.println("no items");
			}
			//printRoom(player);
			System.out.println("\nList of Exits:");
			for(int j = 0; j<player.getCurrentRoom().getExits().size(); j++)
			{
				System.out.println(player.getCurrentRoom().getExits().get(j).getName());
			}
			
			parse(collectInput(), player);
		}

	}

	private static void printRoom(Player player) {
		
		System.out.println("\nCurrent Room: "+player.getCurrentRoom().getName()+ "\n");
		System.out.println();
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println();
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println();



	}

	private static String[] collectInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your command");
		return scan.nextLine().split(" ");
	}
	private static void printFixtureInfo(String name, String shortDesc, String longDesc)
	{
		System.out.println();
		System.out.println(name);
		System.out.println();
		System.out.println();
		System.out.println(shortDesc);
		System.out.println();
		System.out.println(longDesc);
	}

	private static void parse(String[] command, Player player) {
		

		// Command for the moment must be wrote like "go roomName"
		
		switch (command[0]) {
		case "go":
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
 			System.out.println("\nList of Exits:");
 			for(int j = 0; j<player.getCurrentRoom().getExits().size(); j++)
 			{
 				System.out.println(player.getCurrentRoom().getExits().get(j).getName());
 			}
			break;
			
		case "interact":
			// Will get the current Room name
			Room room = player.getCurrentRoom();
			if(room.getName() == "Livingroom") {
				switch(command[1]) {
					case "Clock":
						room.getInteractive().get(0).interactWith();
						break;
					case "Couch":
						room.getInteractive().get(1).interactWith();
						break;
					case "TV":
						room.getInteractive().get(2).interactWith();
						break;
					default:
						System.out.println("\nWrong Input\n");
				}
			}else if(room.getName() == "Kitchen") {
				switch(command[1]) {
				case "Stove":
					room.getInteractive().get(0).interactWith();
					break;
				case "Fridge":
					room.getInteractive().get(1).interactWith();
					break;
				}
				
			}
			// anyone can add it's case like i am doing for livingroom
			
			break;
		default:
			System.out.println();
			System.out.println("Wrong input");
			System.out.println();
			break;
		
		}
	}
}

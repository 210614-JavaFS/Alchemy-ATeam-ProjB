package com.game;

import java.util.Scanner;

import com.fixtures.objects.*;
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
			System.out.println("You're at room"  + player.getCurrentRoom().getName());
			System.out.println("\n\n" + player.getCurrentRoom().getLongDescription());
			System.out.println("\nItems to interact with \n" + player.getCurrentRoom().objectName());
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
			{
				player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
				break;
			}
			case "use":
			{
				if (command[1].equals(player.getCurrentRoom().objectName())) {
					player.getCurrentRoom().interaction();
				}
				break;
			}
		}
	}
}

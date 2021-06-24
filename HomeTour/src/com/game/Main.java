package com.game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				
		RoomManager manager = new RoomManager();
		manager.init();
		Player player = new Player(manager.startingRoom);

		// While condition will change. set to true during development
		while (true) {
			printRoom(player);
			parse(collectInput(), player);
		}

	}

	private static void printRoom(Player player) {
		System.out.println("\nCurrent Room: "+player.getCurrentRoom().getName()+ "\n");
	}

	private static String[] collectInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your command");
		return scan.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) {

		// Command for the moment must be wrote like "go roomName"
		//System.out.println("hey");
		//System.out.println(command[0]);
		switch (command[0]) {
		case "go":
			//System.out.println("hello");
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
			System.out.println("\nList of Exits:");
			for(int j = 0; j<player.getCurrentRoom().getExits().size(); j++)
			{
				System.out.println(player.getCurrentRoom().getExits().get(j).getName());
			}
			
		}

	}

}

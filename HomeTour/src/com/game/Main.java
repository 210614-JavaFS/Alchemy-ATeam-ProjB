package com.game;

import java.util.Scanner;

import com.fixtures.objects.*;
import com.fixtures.rooms.LivingRoom;

public class Main {

	static RoomManager manager;
	public static void main(String[] args) {


		manager = new RoomManager();

		
				
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

		System.out.println(player.getCurrentRoom().getName());
		System.out.println();
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println();
		System.out.println(player.getCurrentRoom().getShortDescription());
		System.out.println();

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
		case "Interact":
			player.getCurrentRoom().getName().equals("Livingroom");
				
		case "Clock":
			
				Clock clock=new Clock();
				clock.showTime();
				break;

		case "Television":
			player.getCurrentRoom().getName().equals("Livingroom");
			Television television=new Television();
			television.showTV();
			break;
			
		case "Couch":
			player.getCurrentRoom().getName().equals("Livingroom");
				Couch couch=new Couch();
				couch.Print();
				break;
			
		default:
			System.out.println();
			System.out.println("Wrong input");
			System.out.println();
			

			System.out.println("\nList of Exits:");
			for(int j = 0; j<player.getCurrentRoom().getExits().size(); j++)
			{
				System.out.println(player.getCurrentRoom().getExits().get(j).getName());
			}

			
		}
	}
}

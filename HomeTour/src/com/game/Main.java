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
		System.out.println(player.getCurrentRoom().toString());
	}

	private static String[] collectInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your command");
		return scan.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) {

		// Command for the moment must be wrote like "go roomName"
		switch (command[0]) {
		case "go":
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));

		}

	}

}

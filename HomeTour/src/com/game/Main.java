package com.game;

import java.util.Scanner;

import com.fixtures.objects.*;
import com.fixtures.rooms.Room;

public class Main {

	static RoomManager manager;
	public static void main(String[] args) {


		manager = new RoomManager();

System.out.println("		HHHHHHHHH     HHHHHHHHH                                                                  TTTTTTTTTTTTTTTTTTTTTTT                    ");                               
System.out.println("		H:::::::H     H:::::::H                                                                  T:::::::::::::::::::::T                        ");                           
System.out.println("		H:::::::H     H:::::::H                                                                  T:::::::::::::::::::::T                           ");                        
System.out.println("		HH::::::H     H::::::HH                                                                  T:::::TT:::::::TT:::::T                              ");                     
System.out.println("		  H:::::H     H:::::H     ooooooooooo      mmmmmmm    mmmmmmm       eeeeeeeeeeee         TTTTTT  T:::::T  TTTTTTooooooooooo   uuuuuu    uuuuuu rrrrr   rrrrrrrrr ");  
System.out.println("		  H:::::H     H:::::H   oo:::::::::::oo  mm:::::::m  m:::::::mm   ee::::::::::::ee               T:::::T      oo:::::::::::oo u::::u    u::::u r::::rrr:::::::::r  ");
System.out.println("		  H::::::HHHHH::::::H  o:::::::::::::::om::::::::::mm::::::::::m e::::::eeeee:::::ee             T:::::T     o:::::::::::::::ou::::u    u::::u r:::::::::::::::::r ");
System.out.println("		  H:::::::::::::::::H  o:::::ooooo:::::om::::::::::::::::::::::me::::::e     e:::::e             T:::::T     o:::::ooooo:::::ou::::u    u::::u rr::::::rrrrr::::::r");
System.out.println("		  H:::::::::::::::::H  o::::o     o::::om:::::mmm::::::mmm:::::me:::::::eeeee::::::e             T:::::T     o::::o     o::::ou::::u    u::::u  r:::::r     r:::::r");
System.out.println("		  H::::::HHHHH::::::H  o::::o     o::::om::::m   m::::m   m::::me:::::::::::::::::e              T:::::T     o::::o     o::::ou::::u    u::::u  r:::::r     rrrrrrr");
System.out.println("		  H:::::H     H:::::H  o::::o     o::::om::::m   m::::m   m::::me::::::eeeeeeeeeee               T:::::T     o::::o     o::::ou::::u    u::::u  r:::::r            ");
System.out.println("		  H:::::H     H:::::H  o::::o     o::::om::::m   m::::m   m::::me:::::::e                        T:::::T     o::::o     o::::ou:::::uuuu:::::u  r:::::r            ");
System.out.println("		HH::::::H     H::::::HHo:::::ooooo:::::om::::m   m::::m   m::::me::::::::e                     TT:::::::TT   o:::::ooooo:::::ou:::::::::::::::uur:::::r            ");
System.out.println("		H:::::::H     H:::::::Ho:::::::::::::::om::::m   m::::m   m::::m e::::::::eeeeeeee             T:::::::::T   o:::::::::::::::o u:::::::::::::::ur:::::r            ");
System.out.println("		H:::::::H     H:::::::H oo:::::::::::oo m::::m   m::::m   m::::m  ee:::::::::::::e             T:::::::::T    oo:::::::::::oo   uu::::::::uu:::ur:::::r            ");
System.out.println("		HHHHHHHHH     HHHHHHHHH   ooooooooooo   mmmmmm   mmmmmm   mmmmmm    eeeeeeeeeeeeee             TTTTTTTTTTT      ooooooooooo       uuuuuuuu  uuuurrrrrrr            ");
System.out.println("");	                                                                                                                                                                
				
		RoomManager manager = new RoomManager();

		manager.init();
		Player player = new Player(manager.startingRoom);

		// While condition will change. set to true during development
		while (true) {
			
			System.out.println("===========================================================");
			System.out.println("You're in the "  + player.getCurrentRoom().getName());
			System.out.println("===========================================================");
			System.out.println("\n" + player.getCurrentRoom().getLongDescription());
			System.out.println("");
			
			System.out.println("===========================================================");
			System.out.println("Items to interact with ");
			System.out.println("===========================================================");
			System.out.println(player.getCurrentRoom().objectName());
			System.out.println("");
			//printRoom(player);
			System.out.println("===========================================================");
			System.out.println("List of Exits:");
			System.out.println("===========================================================");
			
			for(int j = 0; j<player.getCurrentRoom().getExits().size(); j++)
			{
				System.out.println(player.getCurrentRoom().getExits().get(j).getName());
			}
			
			parse(collectInput(), player);
		}

	}

	private static void printRoom(Player player) {
		System.out.println("===========================================================");
		System.out.println("Current Room: "+player.getCurrentRoom().getName()+ "");
		System.out.println("===========================================================");
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

package game;

import fixtures.Room;

public class Menus {
	/*
	 * This method prints information to the console regarding the 
	 * player's current location...
	 */
	public static void printRoom(Player player) {
		System.out.println(":::: CURRENT ROOM ::::");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Desc: " + player.getCurrentRoom().getShortDesc());
		System.out.println("Long Desc: " + player.getCurrentRoom().getLongDesc());
		Menus.printRoomExits(player);
		Menus.printInteractableObjects(player.getCurrentRoom());
	}
	
	/*
	 * Method used to print Instructions for how to play the game
	 */
	public static void printInstructions() {
		System.out.println("Here, we can print a message about "
				+ "how to play the game..."
				+ "\nIncluding directions and what commands to use..."
				+ "\nThis message is encapsulated in a separate method"
				+ "\nso the instructions can be printed at any time...");
	}
	
	/*
	 * This method is used to print a list of all exits connected to
	 * a Room. This method is based on the arbitrary way that the 
	 * connections to rooms are established. In the case of the example
	 * the Room class has a 'getExit' method which can be used to 
	 * arbitrarily determine a string associated with an exit (i.e.
	 * North/South/East/West), and we print this information using
	 * this method
	 */
	public static void printRoomExits(Player player) {
		// TODO: Implement Method
	}

	/*
	 * This method is used to Print a list of the Objects in a room
	 * using the list of 'items' (Fixture[]). Specifically, this 
	 * method searches through all Fixture objects of the items in
	 * a Room, and if the Fixture Object is an instanceof (binary operator)
	 * the Interactable interface, we print it out.
	 */
	public static void printInteractableObjects(Room room) {
		// TODO: Implement Method
	}
}

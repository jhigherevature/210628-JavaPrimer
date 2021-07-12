package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Input {
	/*
	 * This method prints information to the console regarding the player's current
	 * location... This method, along with the instructions for how to play may be
	 * better suited for another separate "Menus or Display" class
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
	 * Method used to gather input from the user, and converts it to an array
	 */
	@SuppressWarnings("resource")
	public static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		String[] phrase = input.split(" ");
		return phrase;
	}

	/*
	 * Method used to examine collected input and perform actions
	 */
	public static void parse(String[] command, Player player) {
		/*
		 * 'action' relates to the overall functionality we want to perform this
		 * includes, moving the player, interacting with an object and quitting
		 */
		String action = command[0].toUpperCase().intern();

		/*
		 * 'details' refers to additional options for the specific commands. Set to null
		 * initially, because we don't know if the player will enter an additional
		 * command...
		 */
		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			if (details != null) {
				// try to move the player
				movePlayer(details, player);
			} else {
				// If you do not enter a direction
				System.out.println("Enter a direction");
			}
		} else if (action == "INTERACT") {
			if (details != null) {
				// try to interact with an object
				objectInteraction(details, player);
			} else {
				// If you do not enter an item name...
				System.out.println("Enter an item name");
			}
		} else if (action == "QUIT") {
			Runner.endGame();
		}
	}

	/*
	 * This logic exists in a separate method for readability (i.e. abstraction)
	 */
	public static void movePlayer(String details, Player player) {
		System.out.println("You try to move: " + details);
		/*
		 * getExit method from the Room class...find an exit in a direction
		 */
		Room move = player.getCurrentRoom().getExit(details);
		player.setCurrentRoom(move);
	}

	/*
	 * This logic exists in a separate method for readability (i.e. abstraction)
	 */
	public static void objectInteraction(String details, Player player) {
		Fixture[] items = null;
		if ((items = player.getCurrentRoom().getItems()) != null) {
			for (Fixture i : items) {
				if (i.getName().equalsIgnoreCase(details) & (i instanceof Interactable)) {
					((Interactable) i).interact();
				} else {
					System.out.println("Item not found");
				}
			}
		} else {
			System.out.println("No Items to interact with");
		}
	}
}

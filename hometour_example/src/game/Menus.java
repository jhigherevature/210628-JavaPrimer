package game;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Menus {
	public static void printRoomExits(Player player) {
		System.out.println("Adjacent Rooms:");
		/*
		 * Reference the exits connected to the player's current room
		 */
		Room[] connected = player.getCurrentRoom().getExits();

		/*
		 * Print the rooms and their direction. This switch statement matches the
		 * arbitrary way our Room Class determines directions
		 */
		for (int i = 0; i < connected.length; i++) {
			if (connected[i] != null) {
				switch (i) {
				case 0:
					System.out.print("\tNorth: ");
					break;
				case 1:
					System.out.print("\tSouth: ");
					break;
				case 2:
					System.out.print("\tWest: ");
					break;
				case 3:
					System.out.print("\tEast: ");
					break;
				}

				System.out.println(connected[i].getName());
			}
		}
	}

	public static void printInteractableObjects(Room room) {
		/*
		 * Reference the exits connected to the player's current room
		 */
		Fixture[] items = room.getItems();

		/*
		 * Print the rooms and their direction. This switch statement matches the
		 * arbitrary way our Room Class determines directions
		 */
		if (items != null && items.length > 0) {
			System.out.println("Interactable Items: ");
			for (Fixture i : items) {
				if (i instanceof Interactable) {
					System.out.println("\t"+i.getName());
				}
			}
		}
	}
}

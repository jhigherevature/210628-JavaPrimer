package game;

import fixtures.Refridgerator;
import fixtures.Room;

/*
 * The RoomManager class is used to create all of the Rooms in
 * the house, establish the exits, create the Room Objects, and
 * add those objects to the rooms.
 * 
 * This class contains the most lines of code, due to the number
 * of objects being created by this class
 */
public class RoomManager {
	private Room startingRoom;
	
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		/*
		 * The init method is called one time at the start
		 * of our program execution to create all rooms, 
		 * set exits, create other objects, and set object
		 * lists for those rooms...
		 */
		
		// 1 - Create all Rooms
		Room room1 = new Room(
			"Kitchen",
			"Room 1 - Short Description",
			"Room 1 - Long Description");
		this.rooms[0] = room1;
		// create more rooms here...
		
		
		// 2 - Set Exits
		Room[] room1Exits = {null, null, null, null};
		room1.setExits(room1Exits);
		// set other room exits here...

		// 3 - Create Objects 
		Refridgerator refridgerator = new Refridgerator("Fridge", "A Stainless Steel Fridge", "Long Description");
		// create other objects here...
				
		/*
		 * 4 - Set item list for Rooms (note, we used a 
		 * VarArgs for the setItems method in the Room Class
		 */
		room1.setItems(refridgerator);
		// set other room objects here...
		
		// 5 - Set Starting Room
		this.startingRoom = room1;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}

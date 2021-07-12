package game;

import fixtures.Refridgerator;
import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		Room room1 = new Room(
			"Kitchen",
			"Room 1 - Short Description",
			"Room 1 - Long Description");
		this.rooms[0] = room1;
		
		Room room2 = new Room(
			"Garage",
			"Room 2 - Short Description",
			"Room 2 - Long Description");
		this.rooms[1] = room2;
		
		Room room3 = new Room(
			"Bedroom 1",
			"Room 3 - Short Description",
			"Room 3 - Long Description");
		this.rooms[2] = room3;
		
		Room room4 = new Room(
			"Bathroom 1",
			"Room 4 - Short Description",
			"Room 4 - Long Description");
		this.rooms[3] = room4;
		
		this.startingRoom = room1;
		
		Room[] room1Exits = {room2, room3};
		room1.setExits(room1Exits);
		
		room2.setExits(room1, 1);
		room2.setExits(room4, 3);
		room3.setExits(room1, 0);
		
		room4.setExits(room2, 2);
		
		// the setItems method declares a varargs parameter for Fixture objects
		room1.setItems(new Refridgerator("Fridge", "A Stainless Steel Fridge", "Long Description"));
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

package game;

import fixtures.Room;

public class Player {
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}

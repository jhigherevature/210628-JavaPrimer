package examples;

public class Manager {
	private Room[] rooms;
	
	public Manager(Room... rooms) {
		this.rooms = rooms;
	}
	
	public Room[] getRooms() {
		return rooms;
	}
	
	public Room getRoom(int index) {
		return rooms[index];
	}
}

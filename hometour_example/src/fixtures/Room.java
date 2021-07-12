package fixtures;

public class Room extends Fixture {
	/*
	 * exits is a list of the 'adjacent' rooms...We establish
	 * that all rooms will have an array that can hold 4 references
	 * since we want to attribute each index with a cardinal 
	 * direction
	 */
	private Room[] exits = new Room[4];
	
	// If you want extra knick-knacks in your rooms...
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * Here, I have arbitrarily associated the cardinal directions
	 * North, South, East and West to indexes of the exits array
	 */
	public Room getExit(String direction) { 
		int index = 0;
		direction = direction.toUpperCase();
		switch (direction) {
		case "NORTH":
			index = 0;
			break;
		case "SOUTH":
			index = 1;
			break;
		case "WEST":
			index = 2;
			break;
		case "EAST":
			index = 3;
			break;			
		}
		
		// If statement checks if there is actually a room in certain direction
		if (index >= this.exits.length || this.exits[index] == null) {
			System.out.println("There is no room in that direction");
			
			// Return the current room is there is not a room in that direction
			return this;
		}
		
		return this.exits[index];
	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItems() {
		return items;
	}
	
	public void setItems(Fixture... items) {
		this.items = items;
	}
}

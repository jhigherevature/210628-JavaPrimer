package game;

public class Runner {
	// We only need one room manager, so we will make it static
	private static RoomManager manager = new RoomManager(4);
	
	// Boolean used to control when our game is running. We set it to true initially
	private static boolean running = true;
		
	// Main method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		manager.init();		
		
		/* Create the player here. Note: We could 
		 * have made the player a static object as well...
		 */
		Player player = new Player();
		
		System.out.println("Here, we can print a message about"
				+ "how to play the game. "
				+ "\nIncluding directions and what commands to use..."
				+ "\nYou can also save this message as a method which prints "
				+ "\nto the console, if you want to be able to print"
				+ "\nthe instructions at any time...");
		
		
		// The player should start in the 'starting room'
		player.setCurrentRoom(manager.getStartingRoom());
		
		while (running) {
			Input.printRoom(player);
			String[] input = Input.collectInput();
			Input.parse(input, player);
		}
		
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	public static void endGame() {
		running = false;
	}
}

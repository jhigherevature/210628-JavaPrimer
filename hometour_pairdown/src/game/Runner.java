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
		
		/* Create the player here. 
		 * *Note: We could have made the player a static object
		 * as well, just like the RoomManager
		 */
		Player player = new Player();
		
		// Print instructions to play the game
		Menus.printInstructions();
		
		// The player should start in the 'starting room'
		player.setCurrentRoom(manager.getStartingRoom());
		
		/*
		 * Game Logic...We print the player's location and ask for 
		 * input...thats it!
		 */
		while (running) {
			Menus.printRoom(player);
			String[] input = Input.collectInput();
			Input.parse(input, player);
		}
		
		/*
		 * This if statement is actually not required, but
		 * explicitly details that we will print the following
		 * message, only when the game is no longer running
		 */
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	/*
	 * Since the 'running' boolean is private, this allows us
	 * to change the state of the game to 'off'. Note that we
	 * do not need to change running to 'true' in any method
	 * if we simply set running to true initially...
	 */
	public static void endGame() {
		running = false;
	}
}

package examples;

public class Simulator {
	public static void main(String[] args) {
		Room one = new Room("One");
		Room two = new Room("Two");
		Room three = new Room("Three");
		Room four = new Room("Four");
		
		Manager manage = new Manager(one, two, three, four);
		
		System.out.println(manage.getRoom(0));
		
		for (Room r : manage.getRooms()) {
			System.out.println(r);
		}
		
		Player p = new Player();
		p.setCurrentRoom(manage.getRoom(0));
		
		String phrase = "yes";
		if (phrase == "yes") {
			p.setCurrentRoom(manage.getRooms()[1]);
		} else {
			p.setCurrentRoom(manage.getRooms()[3]);
		}
		
		Vase v = new Vase();
		
		System.out.println(v instanceof Touchable); // true or false
		
		System.out.println(p instanceof Touchable);
	}
	
	public static void performTouch(Object o) {
		if (o instanceof Touchable) {
			((Touchable)o).touch();
		} else {
			// do something else...
		}
	}
}

package main;

import animal.Flyable;
import animal.Sparrow;
import vehicle.Plane;

public class Application {
	public static void main(String[] args) {
		Plane p = new Plane();
		makeFly(p);
		
		Sparrow s = new Sparrow();
		makeFly(s);
	}
	
	public static void makeFly(Flyable flyable) {
		flyable.fly();
	}
}

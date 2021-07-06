package animal;

import other.Cat;

public class AnimalShelter {
	public static void main(String[] args) {
		Owner joe = new Owner();
		joe.owner_name = "Joseph";
		
		Dog fido = new Dog("Fido", 5);
		Dog brian = new Dog("Brian", 7);
		Cat james = new Cat("James", 2);
		Animal[] animals = new Animal[] {fido, brian, james};
		joe.pets = animals;
	}
}

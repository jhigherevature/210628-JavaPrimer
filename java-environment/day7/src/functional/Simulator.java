package functional;

public class Simulator {
	public static void main(String[] args) {
		Function func = new Performer();
		func.method();
		
		Function lam = () -> {
				System.out.println("Lambdas are kinda cool!");
				};
		lam.method();
		
		PrintMessage pmLam = (num, word) -> {
			if (num < 10) 
				System.out.println("[Print Message - Lambda Version]\nNumber: "+ num + "\nWord: "+word);
			else
				System.out.println("Thats a high number!");
		};
		pmLam.print(17, "Revature");
		
		HelloWorldInterface helloLam = () -> {System.out.println("Hello World");};
		helloLam.sayHello();
	}
}

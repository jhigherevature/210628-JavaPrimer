package scopes;

public class Simulator {
	public static void main(String[] args) {
		Data d = new Data();
		d.id = 18;
		d.name = "Joseph";
		
		double value = d.method();
		
		Data.staticId = 9;
		Data.staticName = "Revature";
		
		System.out.println(d.staticId);
		System.out.println(d.staticName);
		
		d.shadow();
	}
}

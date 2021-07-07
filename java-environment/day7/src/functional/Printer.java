package functional;

public class Printer implements PrintMessage {

	@Override
	public void print(int i, String str) {
		System.out.println("int was: " + i + ", String was: " + str);
	}
}

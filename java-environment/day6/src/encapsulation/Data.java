package encapsulation;

public class Data {
	public static String pub = "Public";
	protected static String pro = "Protected";
	static String def = "Package-Private / Default";
	private static String pri = "Private";
	
	public static void main(String[] args) {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
}

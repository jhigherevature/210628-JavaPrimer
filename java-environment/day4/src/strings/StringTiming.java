package strings;

public class StringTiming {
	/*
	 * n is used to control how many strings we create/manipulate
	 */
	public static int n = 400_000;
	
	public static void main(String[] args) {
//		createWithString();
		createWithStringBuilder();
		createWithStringBuffer();
	}
	
	public static void createWithString() {
		String s = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s = s.concat("a"); 
		}
		long end = System.currentTimeMillis();
		System.out.println("Strings took: " + (end - start) + "ms");
	}
	
	public static void createWithStringBuilder() {
		StringBuilder sb = new StringBuilder("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder took: " + (end - start) + "ms");
	}
	
	public static void createWithStringBuffer() {
		StringBuffer sb = new StringBuffer("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer took: " + (end - start) + "ms");
	}
	
}

package flowcontrol;

public class BreakAndContinue {
	public static void main(String[] args) {
//		int i = 0;
//		while (true) {
//			if (i >= 10)
//				break;
//
//			System.out.println(i);
//			i++;
//		}
		
		System.out.println("BREAK: ");
		for (char letter = 'A'; letter <= 'D'; letter++) {
			for (int num = 0; num < 4; num++) {
				if (num == 2)
					break;
				System.out.println(letter + ":" + num);
			}
		}
		
		System.out.println("CONTINUE:");
		for (char letter = 'A'; letter <= 'D'; letter++) {
			for (int num = 0; num < 4; num++) {
				if (num == 2)
					continue;
				System.out.println(letter + ":" + num);
			}
		}
		
		/*
		 * Labels : Arbitrary monikers/names given to various flow
		 * control statements (mostly loops) to provide a way to 
		 * distinguish which structure we want a break or continue
		 * statement to apply to
		 * 
		 * label syntax:
		 * <label-name> : for ()...
		 * <label-name> : while ()...
		 * <label-name> : do {}...
		 */
		System.out.println("BREAK [with labels]: ");
		alpha : for (char letter = 'A'; letter <= 'D'; letter++) {
			numeric: for (int num = 0; num < 4; num++) {
				if (num == 2)
					break alpha;
				System.out.println(letter + ":" + num);
			}
		}
		
		System.out.println("CONTINUE [with labels]:");
		alpha : for (char letter = 'A'; letter <= 'D'; letter++) {
			numeric : for (int num = 0; num < 4; num++) {
				if (num == 2)
					continue alpha;
				System.out.println(letter + ":" + num);
			}
		}
	}
}

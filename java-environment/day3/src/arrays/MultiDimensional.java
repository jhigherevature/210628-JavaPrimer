package arrays;

public class MultiDimensional {
	public static void main(String[] args) {
		int[][] twoDee = new int[][] {
		//	   0		1		 2
		//	 0 1 2    0 1 2    0 1 2	
			{1,2,3}, {4,5,6}, {7,8,9}
		};
			
		int[][] twoDee_2 = new int[][] {
		//	   0			1			2
		//	  0  1  2    0  1  2     0  1  2	
			{11,12,13}, {14,15,16}, {17,18,19}
		};
			
		System.out.println(twoDee[0][0]); // 1
		System.out.println(twoDee[1][0]); // 4
			
		int[][][] coordinates = {
			//				0									1
			//		0		1		2			  0			  1			  2
			//	  0 1 2    0 1 2	0 1 2	   0  1  2	    0 1  2 		0  1  2
				{{1,2,3}, {4,5,6}, {7,8,9}}, {{11,12,13}, {14,15,16}, {17,18,19}}
			};
		
		System.out.println(coordinates[0][1][2]);
	}
}

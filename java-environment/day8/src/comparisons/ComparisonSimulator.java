package comparisons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * The Arrays class in java (found in the java.util package) 
 * provides a number of static, utility methods that can 
 * perform helpful actions with array objects, such as 
 * sorting, searching, filling, or printing the information
 * within the array
 * 
 * The Collections class (Note: Collection without an 's' refers
 * to the interface, Collections with an 's' refers to this class)
 * similarly provides a number of static, utility methods that
 * can perform helpful actions with objects that inherit from
 * the Collection Interface, such as Sets, Lists, Queue and 
 * their derivative classes
 */
public class ComparisonSimulator {
	public static void main(String[] args) {

		Data d_1 = new Data(3, 1.5);
		Data d_2 = new Data(80, 7.3);
		Data d_3 = new Data(37, 3.8);
		Data d_4 = new Data(101, 2.7);
		Data d_5 = new Data(18, 19.4);
		Data[] datas = { d_1, d_2, d_3, d_4, d_5 };
		System.out.println(datas);
		System.out.println("Comparable:");
		System.out.println("Before Sort:");
		System.out.println(Arrays.toString(datas));
		Arrays.sort(datas);
		System.out.println("After Sort:");
		System.out.println(Arrays.toString(datas));

//		System.out.println("Comparator [ID]:");
//		ArrayList<Data> list = new ArrayList<Data>();
//		list.add(d_1);
//		list.add(d_2);
//		list.add(d_3);
//		list.add(d_4);
//		list.add(d_5);
//		System.out.println("Before ID Sort:\n" + list);
//		Collections.sort(list, new DataIdComparator());
//		System.out.println("ID Sort:\n"+ list);
//		
//		System.out.println("Comparator [WEIGHT]:");
//		System.out.println("Before Weight Sort:\n"+list);
//		Collections.sort(list, new DataWeightComparator());
//		System.out.println("Weight Sort:\n"+list);
	}
}

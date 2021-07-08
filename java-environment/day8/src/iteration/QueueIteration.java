package iteration;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIteration {
	public static void main(String[] args) {
		System.out.println("::: QUEUES :::");
		Queue<String> pQue = new PriorityQueue<String>();
		pQue.add("Assembly");
		pQue.add("Function");
		pQue.add("Binary");
		pQue.add("Compile");
		pQue.add("Compile");
		pQue.add("Compile");
		pQue.add("DataStructure");
		
		/*
		 * Note: Iterators for many data structures
		 * (including priorityQueues) do not guarantee the 
		 * order of traversal. Even if the data structure
		 * itself uses some sort of 'ordering'. This is
		 * because the storage of data (the data structure)
		 * and the access to that data (iteration) are 
		 * controlled by different systems. The implementation
		 * provided within the JRE can look pseudo-random 
		 * at times
		 */
		System.out.println("Queue - Enhanced For-Loop");
		for (String name : pQue) {
			System.out.println(name);
		}
		
		System.out.println("Queue - While Loop");
		Iterator<String> qItr = pQue.iterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
	}
}

package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> trainQueue = new LinkedList<String>();
		trainQueue.add("A");
		trainQueue.add("B");
		trainQueue.add("C");
		trainQueue.add("D");
		trainQueue.add("E");
		trainQueue.add("F");
		trainQueue.add("G");
		trainQueue.add("H");
		trainQueue.add("I");

		printList(trainQueue);


		String peekTest = trainQueue.peek();
		System.out.println("peekTest = " + peekTest);

		// Removed H from the queue
		trainQueue.remove("H");


		printList(trainQueue);
	}
	// This this a helper method to printout queue using for each loop
	public static void printList(Queue <String> trainQueue) {
		for (String x: trainQueue)
			System.out.print(x +  " ");
		System.out.println();
	}
}

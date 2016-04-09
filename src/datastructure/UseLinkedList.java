package datastructure;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


        LinkedList<Integer>myLinkedList = new LinkedList<Integer>();
        // Adding elements in LinkedList

        myLinkedList.add(10);
        myLinkedList.add(13);
        myLinkedList.add(20);
        myLinkedList.add(23);
        myLinkedList.add(15);
        myLinkedList.add(44);
        printList(myLinkedList);

        System.out.println("===================================");
        // Removed Array list
        myLinkedList.remove(1);
        printList(myLinkedList);
        System.out.println(myLinkedList.get(2));

    }

    // Method to iterate Linked list using for each loop
    public static void printList(LinkedList <Integer> arrayTest) {
        for (int x: arrayTest)
            System.out.print(x +  " ");
        System.out.println();
    }
	}




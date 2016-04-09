package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        // Adding elements in ArrayList

        myArrayList.add(10);
        myArrayList.add(13);
        myArrayList.add(20);
        myArrayList.add(23);
        myArrayList.add(15);
        myArrayList.add(44);
        printList(myArrayList);

        System.out.println("===================================");
        // Removed Array list
        myArrayList.remove(1);
        printList(myArrayList);
        System.out.println(myArrayList.get(2));

	}

    // Method to iterate array list using for each loop
    public static void printList(ArrayList <Integer> arrayTest) {
        for (int x: arrayTest)
            System.out.print(x +  " ");
        System.out.println();
    }
}

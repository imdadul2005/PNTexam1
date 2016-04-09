package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<String> states = new ArrayList<String>();
		// Adding elements in ArrayList

		states.add("NY");
		states.add("NJ");
		states.add("PA");
		states.add("AZ");

		ArrayList<String> computer = new ArrayList<String>();
		// Adding elements in ArrayList

		computer.add("Dell");
		computer.add("Asus");
		computer.add("Lenovo");
		computer.add("Sony");

		Map<String, List<String>> myList = new HashMap<String, List<String>>();
		myList.put("States",states);
		myList.put("Computer",computer);
		myList.put("Cars", Arrays.asList("Toyota","Honda","BMV"));

		//Retriving elements from Map

		System.out.println("List of States: " + myList.get("States"));
		System.out.println("List of Cars: " + myList.get("Cars"));

		//Retriving information using for each loop

		for (Map.Entry<String,List<String>> e : myList.entrySet()){
			String key = e.getKey();
			List values  = e.getValue();
			System.out.println(key + " : "+ values);
		}
	}

}

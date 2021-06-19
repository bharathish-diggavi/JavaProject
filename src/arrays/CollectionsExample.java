package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import classesandobjects.Car;

// Collections - jva.util
// 3 types of collections - List, Set, Map
public class CollectionsExample {

	public static void main(String[] args) {
		//List - ArrayList
		// Lists maintain the insertion order
		// Duplicates are allowed
		//Car c1 = new Car();
//		ArrayList<Car> list = new ArrayList<>();
//		
//		list.add(new Car("Toyota", "Innova", 2020));
//		list.add(new Car("Maruti", "Swift", 2020));
//		list.add(new Car("Ford", "Figo", 2020));
//		
//		for(int i =0; i < list.size(); i++) {
//			System.out.println(list.get(i).brand);
//		}
		
//		ArrayList<String> names = new ArrayList<>();
//		names.add("name1");
//		names.add("name2");
//		names.add("name3");
//		names.add("name1");
//		
//		for(int i =0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
		//Set
		// HashSet
		// 1. Sets are not index based
		
//		HashSet<String> names = new HashSet<>();
//		names.add("name1");
//		names.add("name2");
//		names.add("namasdhgassjd");
//		names.add("name1");
//		
//		// enhanced for loops, where we don't use the index we directly use type and variables
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		// Map
		// HasMap
		// 1. key value pairs
		// 2. can not have duplicate keys
		// 3. can have duplicate values
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("length", 10);
		map.put("breadth", 20);
		map.put("height", 30);
		map.put("length", 40);
		
		System.out.println(map.get("length"));
		System.out.println(map.get("breadth"));
		System.out.println(map.get("height"));
	}
}

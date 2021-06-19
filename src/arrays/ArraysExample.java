package arrays;

import classesandobjects.Car;

// Arrays, Collections, String

// 1. variables are containers for some value
// 2. Arrays are container of containers of some type
// 3. While reading from an array or assigning values for array objects the index should always be 0 and less than the length of the array
// 4. 
public class ArraysExample {

	public static void main(String[] args) {

//		Car c1 = new Car();
//		int[] arr = new int[3]; // declaration, if the length is n then the maximum index that we can use is n-1
//		System.out.println(arr.length);
//		
//		arr[0] = 10; // value assignment
//		arr[1] = 20;
//		arr[2] = 30;
//		
//		System.out.println("---------------");
//		System.out.println(arr[0]); // reading the value from an array
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[4]);

//		int[] arr = new int[] {10, 20, 30};
//		System.out.println(arr[0]); // reading the value from an array
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

//		Car[] carsArray = new Car[2];
//		carsArray[0] = new Car("Ford", "Figo", 2020);
//		carsArray[1] = new Car("Toyota", "innova", 2021);
//		
//		System.out.println("-----------");
//		System.out.println(carsArray[0].brand);
//		System.out.println(carsArray[1].brand);

		String[] names = new String[] { "name1", "name2", "name3" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}

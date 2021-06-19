package classesandobjects;

// 1. this key word inside a constructor par () - refers to other constructor of the same class
// 2. this keyword in constructor should be called in the first line itself
// 3. this keyword can be used only once in a constructor


// Main things about static and non static variables
// 1. Static variables are same across all the objects, but non static variables can have different values
// 2. A value change of a non static variable reflects in all the objects, but value change in non static variable only reflects in that object


public class Car {
	
	static int nummberOfWheels = 4;
	
	public String brand;
	public String model;
	public int year;
	
	static String country;
	
	
	public Car(String brand, String model, int year) {
//		System.out.println("Inside constructor");
//		System.out.println("Brand is = " + brand);
//		System.out.println("Model is = " + model);
//		System.out.println("Year is = " + year);
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
//	public Car() {
////		System.out.println("Car cunstructor with out any parameters");
//		brand = "Toyota";
//		model = "Fortuner";
//		year = 2020;
//		country = "India";
//	}
//	
//	public Car(int n) {
//		this();
//		System.out.println("Car cunstructor with parameter called, with value " + n);
//	}
//	
//	public Car(int n, int m) {
//		this();
//		System.out.println("Car cunstructor with parameter called, with value " + n);
//	}
	
	public void runs() {
		System.out.println("Car is running");
	}
	
	
	boolean isImported;
	
	
}

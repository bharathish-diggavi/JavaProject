package classesandobjects;

public class ObjectExamples {

	public static void main(String[] args) {
//		Car c1 = new Car(2);
//		
//		System.out.println(c1.model);
//		System.out.println(c1.nummberOfWheels);
//		System.out.println(c1.year);
//		System.out.println(c1.isImported);
//		
//	
//		System.out.println(Car.country);
//		
//		c1.runs();
		
		Car.country = "India";
		Car c2 = new Car("Toyota", "Fortuner", 2020);
		Car c1 = new Car("Ford", "Figo", 2019);
		
		
		System.out.println(Car.nummberOfWheels);
		System.out.println(Car.country);
		
		System.out.println("============================");
		
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c1.country);
		
		System.out.println("---------------------");
		System.out.println(c2.brand);
		System.out.println(c2.model);
		System.out.println(c2.country);
	}
}

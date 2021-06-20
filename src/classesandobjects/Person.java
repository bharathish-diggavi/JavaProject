package classesandobjects;

public class Person {
	String name;
	Car car;
	int age = 20;

	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public void personRuns() {
		System.out.println("Person with name " + this.name + " is running");
	}
}

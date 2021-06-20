package classesandobjects;

public class ObjectExamples2 {
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Innova", 2020);
		Person p1 = new Person("Name1", car1);
		p1.personRuns();
		Car c = p1.car;
		c.runs();		
	}
}

package loops;

import maths.Calculator;

public class LoopsExamples {

	public static void main(String[] args) {
//		prinNameForNTimes("Bharathish", 5);
//		printAreasOfCirclesTill(6);
		findANumberIsPrime(17);
	}

	public static void prinNameForNTimes(String name, int times) {
		for (int i = 1; i <= times; i++) {
			System.out.print(name + " ");
		}
	}

	public static void printAreasOfCirclesTill(int number) {
		// loop
		// calculator
		for (int i = 1; i <= number; i++) {
			Calculator cal = new Calculator();
			double area = cal.areOfACircle(i);
			System.out.print("Area of circle for radius " + i + " : ");

			if (i < number) {
				System.out.println(area);
			} else {
				System.out.print(area);
			}

		}
	}

	public static void findANumberIsPrime(int number) {

		for (int i = 2; i < number; i++) {
			//find the number is divisible by i or not
			// 1. check whether dividend is a whole number
			// 2. check reminder is 0
			// number / i = if it is a whole number
			// 12 % i = 0 = if reminder is zero
			if(number % i == 0) {
				System.out.println("Number is not prime because " + number + " is divisible by " + i);
				return;
			}
			
			System.out.println("i value is " + i);
		}
		
		System.out.println("Number is prime");

	}

	// continue, break, return
	
	// print hello if the number is divisible by 5,
	// print hi if number is divisible by 3,
	// print hello hi if divisible by both
	public static void printHellohi(int number) {
	}

	public static void printNumbersThatAreDivisibleBy3(int number) {
	}

	public static void printEvenNumbersTill(int number) {
	}

	public static void printOddNumbersTill(int number) {
	}

	public static void printCubesOfNumber(int number) {
	}

}

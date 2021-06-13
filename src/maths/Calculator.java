package maths;

public class Calculator {

	private final double pi = 3.14;
	
	public int addition(int a, int b) {
		int c = a + b;
		return c;
	}

	public int substraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public double division(int a, int b) {
		if(b == 0) {
			System.out.println("Can not devide by zero, That's why return -1");
			return -1;
		} else {
			return a / b;	
		}
		
	}
	
	public double reminder(int a, int b) {
		//
		return 0;
	}
	
	public double perimeterOfACircle(int radius) {
		// 2 * pi * r
		return 2 * pi * radius;
	}
	
	public double areOfACircle(int radius) {
		// pi * r * r
		return pi * radius * radius;
	}
	
	public int squareOfANumber(int a) {
		// return square of given number
		return 0;
	}
	
	public int perimeterOfARectangle(int l, int b) {
		// perimeter of the rectangle
		return 0;
	}
	
	public int areaARectangle(int l, int b) {
		// area of the rectangle
		return 0;
	}
	
}

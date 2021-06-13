package maths;
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator clac = new Calculator();
		
		int addRes = clac.addition(10, 60);
		System.out.println(addRes);
		
		int subRes = clac.substraction(10, 60);
		System.out.println(subRes);
		
		int mulRes = clac.multiplication(10, 60);
		System.out.println(mulRes);
		
		double devRes = clac.division(10, 0);
		System.out.println(devRes);
		
		double perimeter = clac.perimeterOfACircle(4);
		System.out.println(perimeter);
		
		double areaOfCircle = clac.areOfACircle(4);
		System.out.println(areaOfCircle);
		
	}
	
	public int addTwoNumbers(int a, int b) {
		return a + b;
	}
	
	// Conditional statements
	// 1. if, if else, switch
}

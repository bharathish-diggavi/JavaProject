package loops;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// while
		// 1st int i = 0;
		boolean value = true;

		int i = 10;

		while (value) {
			System.out.println(i);
			i = i + 2;
			if (i > 10) {
				value = false;
			}
		}
		System.out.println("---------------");

		// 2nd
		int x = 20;
		while (x <= 40) {
			System.out.println(x);
			x = x + 2;
		}
		System.out.println("---------------");
		
		
		// comparission 1
		for (int y = 20; y <= 40; y = y + 2) {
			System.out.println(y);
		}
		System.out.println("---------------");
		
		//comparission 2
		int z = 20;
		for (; z <= 40;) {
			System.out.println(z);
			z = z + 2;
			
		}
	}
}

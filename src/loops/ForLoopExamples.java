package loops;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExamples {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Bharathish1");// 0
		names.add("Bharathish2");// 1
		names.add("Bharathish3");// 2
		names.add("Bharathish4");// 3
		names.add("Bharathish5");// 4

		// for loop only print when name is bharathish2
		int size = names.size();

		for (int i = 0; i < size; i++) {
			String name = names.get(i);
			if (!name.equals("Bharathish2")) {
				continue;
			}
			System.out.println(name);
		}


	}

	public static void forLoopExample() {
		// For loop
		// while loop
		// do while

		System.out.println("start");
		for (int i = 5; i <= 10;) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("----------");

		for (int i = 5; i < 20; i = i + 2) {// 5, 10
			System.out.println(i); // 5, 8
			i = i + 1; // 6, 9
			i = i + 2;// 8
		}
		System.out.println("stop");
	}
}

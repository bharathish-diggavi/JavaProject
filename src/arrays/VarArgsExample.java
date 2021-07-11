package arrays;

public class VarArgsExample {

	public static void main(String[] args) {

		int res = add(1, 2, 3, 6, 7);
		System.out.println(res);
	}

	public static int add(int... arr) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
}

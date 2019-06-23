package Search;

import java.util.Arrays;

public class CryptograhpyTwo {

	public static long encrpyt(int[] numbers) {

		int ret = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		System.out.println(numbers[0]++);
		for (int i = 0; i < numbers.length; i++) {
			ret *= numbers[i];
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };

		System.out.println(encrpyt(numbers));
	}
}

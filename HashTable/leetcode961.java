package HashTable;

import java.util.HashMap;
import java.util.Map;

public class leetcode961 {
	public static int repeatedNTimes(int[] A) {

		HashMap<Integer, Integer> map = new HashMap<>();

		int size = A.length;
		// int N = size/2;
		for (int i = 0; i < size; i++) {

			int count = map.getOrDefault(A[i], 0);
			// if (count +1 == N)... was the better way
			if (count > 0) {
				return A[i];
			}
			map.put(A[i], count + 1);
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 3, 1,1,1,1,1};
		System.out.println(repeatedNTimes(A));
	}
}

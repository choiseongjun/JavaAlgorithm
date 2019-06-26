package Array;

import java.util.ArrayList;
import java.util.List;

public class SearchEmptynum {

	static public int[] solution(int[] A) {

		List<Integer> list = new ArrayList<>();
		list.add(A[0]);

		for (int i = 0; i < A.length; i++) {

			if (A[i] != A[i - 1])
				list.add(A[i]);
		}
		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) 
			answer[i] = list.get(i);
		return answer;
	}

	public static void main(String[] args) {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		System.out.println(solution(A));
	}
}

package List;

import java.util.ArrayList;
import java.util.List;

public class leetcode104 {
	public static int[] singleNumber(int[] arr) {
		int[] answer = {};
		List<Integer> arrList = new ArrayList<>();
		int temp = 0;

		for (int num : arr) {
			if (temp == num) {
				arrList.add(num);
			}
			temp = num;

		}
		answer = new int[arrList.size()];
		for (int i = 0; i < arrList.size(); i++) {
			answer[i] = arrList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {

		int[] number = { 2, 2, 1, 1 };
		System.out.println(singleNumber(number));
	}
}

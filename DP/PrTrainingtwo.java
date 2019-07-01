package DP;

import java.util.HashSet;

public class PrTrainingtwo {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		HashSet<Integer> ko = new HashSet<Integer>();
		for (int k : reserve) {
			ko.add(k);
		}
		for (int i = 0; i < lost.length; i++) {
			if (ko.contains(lost[i])) {
				answer++;
				ko.remove(lost[i]);
				lost[i] = -1;
			}
		}
		for (int i = 0; i < lost.length; i++) {
			// System.out.println(i);
			if (ko.contains(lost[i] - 1)) {
				// System.out.println("있다");
				answer++;
				ko.remove(lost[i] - 1);
			} else if (ko.contains(lost[i] + 1)) {
				// System.out.println("있다");
				answer++;
				ko.remove(lost[i] + 1);
			}
			// System.out.println("없다");
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] reserve = { 1, 3, 5 };
		int[] lost = { 2, 4 };
		PrTrainingtwo pr = new PrTrainingtwo();
		pr.solution(n, lost, reserve);
	}
}

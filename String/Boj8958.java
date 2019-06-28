package String;

import java.io.IOException;
import java.util.Scanner;

public class Boj8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] result = new int[N];

		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			int score = 0;

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == 'O') {
					score++;
					result[i] += score;
				} else {
					score = 0;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(result[i]);
			sc.close();
		}
	}
}

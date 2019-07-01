package DP;

import java.util.Scanner;

public class Boj1932 {

	static int N;
	static int[][] dp;
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		dp = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j]=sc.nextInt();
				if (j == 1)
					dp[i][j] = dp[i - 1][j] + dp[i][j];
				else if (j == i)
					dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
				else
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + dp[i][j];

				if (sum < dp[i][j])
					sum = dp[i][j];
			}
		}
		System.out.println(sum);
	}
}

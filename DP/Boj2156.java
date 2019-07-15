package DP;

import java.util.Scanner;
/*포도주시식문제*/
public class Boj2156 {

	public static int Max(int i,int j,int k) {
		if(i>j)
			return i > k ? i : k;
		else
			return j > k ? j : k;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int value[] = new int[T+1];
		int dp[] = new int[T+1];
		for (int i = 1; i <= T; i++) {
			value[i] = sc.nextInt();
		}

		for (int i = 1; i <= T; i++) {
			// 초기 설정
			if (i < 4) {
				if (i != 3)
					dp[i] = value[i] + dp[i - 1];
				else
					dp[i]=Max(value[i]+value[i-1],value[i-1]+value[i-2],value[i]+value[i-2]);
			}
			//algorithm
			else {
					dp[i]=Max(dp[i-1],value[i]+dp[i-2],value[i]+value[i-1]+dp[i-3]);
			}
		}
System.out.println(dp[T]);
	}

}

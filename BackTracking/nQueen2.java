package BackTracking;

import java.util.Scanner;

public class nQueen2 {

	private static int N;
	private static int cnt;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			int[] col=new int[N+1];
			col[1]=i;
			dfs(col,1); 
		}
		System.out.println(cnt);
	}

	private static void dfs(int[] col, int row) {
		if(row==N) {
			cnt++;//row가 N까지 퀸을 놓았다는 의미이므로 카운트를 증가한다 
		}else {
			for(int i=1;i<=N;i++) {
				col[row+1]=i;
				if(isPossible(col,row+1)) {
					dfs(col,row+1);
				}
			}
		}
	}

	private static boolean isPossible(int[] col, int row) {
		
		for(int i=1;i<row;i++) {
			if(col[i]==col[row]) return false;
			if(Math.abs(i-row)==Math.abs(col[i]-col[row])) return false;
		}
		return true;
	}
}

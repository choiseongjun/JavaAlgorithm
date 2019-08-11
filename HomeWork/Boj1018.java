package HomeWork;

import java.util.Scanner;

public class Boj1018 {

	static int N;
	static int M;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new  int[N][M];
		
		for(int i=0;i<N;i++) {
			String t=sc.next();
			for(int j=0;j<M;j++) {
				arr[i][j]=t.charAt(j);
			}
		}
		int result=Integer.MAX_VALUE;
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				result=Math.min(result, solve(i,j));
			}
		}
		System.out.println(result);
	}

	private static int solve(int x, int y) {
		
		int Bresult=0;
		int temp='B';
		
		for(int i=x;i<x+8;i++) {
			if(arr[i][y]!=temp) Bresult++;
			for(int j=y+1;j<y+8;j++) {
				if(arr[i][j]==temp) {
					Bresult++;
					if(temp=='B') temp='W';
					else temp='B';
				}else  temp=arr[i][j];
			}
		}
		int Wresult=0;
		temp='W';
		for(int i=x;i<x+8;i++) {
			if(arr[i][y]!=temp)  Wresult++;
			for(int j=y+1;j<y+8;j++) {
				if(arr[i][j]==temp) {
					Wresult++;
					if(temp=='B') temp='W';
					else temp='B';
				}else  temp=arr[i][j];
			}
		}
		
		
		return Bresult>Wresult?Wresult:Bresult;
	}
}

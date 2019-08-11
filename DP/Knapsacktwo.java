package DP;

import java.util.Scanner;

public class Knapsacktwo {

	static int N;//diamond kind
	static int W;//Back capacity
	static int [] Wi;//Diamond weigbht
	static int [] Pi;//Diaomond Value
	static int [][] D;//Dynamic Array
	
	static int max(int a,int b) {
		return (a>b) ? a: b;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		N=sc.nextInt();
		W=sc.nextInt();
		
		Wi=new int[N+1];
		Pi=new int[N+1];
		D=new int[N+1][N+1];
		
		for(int i=1;i<=N;i++) {
			Wi[i]=sc.nextInt();
			Pi[i]=sc.nextInt();
		}
		
		for(int i=1;i<=N;i++) {
			
			for(int j=1;j<=W;j++) {
				if(j-Wi[i]<0) {
					D[i][j]=D[i-1][j];
				}else {
					D[i][j]=max(D[i][j-Wi[i]]+Pi[i],D[i-1][j]);
				}
			}
		}
		System.out.println(D[N][W]
				);
	}
}

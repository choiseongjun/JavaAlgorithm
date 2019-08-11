package Greedy;

import java.util.Scanner;

public class Boj2857 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		
		if(N%2==0 && M%1==0) {
			N/=2;
			M/=1;
			if(N+M==K) {
				System.out.println(N+"+"+M);
			}
			
		}
	}
}

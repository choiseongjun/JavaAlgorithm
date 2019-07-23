package Greedy;

import java.util.Scanner;

public class Boj5545 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();

		sc.nextLine();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int[] C=new int[N];
		
		for(int i=0;i<N;i++) {
			C[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			System.out.println(C[i]);
		}
	}
}

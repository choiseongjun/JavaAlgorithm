package Greedy;

import java.util.Scanner;

public class Boj1783 {

	 static int n,m;
	 static Scanner sc = new Scanner(System.in);
	    
	public static void main(String[] args) {
		
		n=sc.nextInt();//세로 
		m=sc.nextInt();//가로 
		
		System.out.println(solve());
	}

	private static int solve() {
		
		if(n==1) return 1;
		if(n==2) return Math.min(4, (m+2)/2);	//4, 26
		if(m<7) return Math.min(7, m);		//7,50
		
		return m-2;
	}
}

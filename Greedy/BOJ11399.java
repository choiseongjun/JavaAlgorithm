package Greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
	
		int i,min=0,n=sc.nextInt(),p[]=new int[n+1];
		
		int sum=0;
		for(i=1;i<=n;i++) {
			p[i]=sc.nextInt();
			
		}
		Arrays.sort(p);

		for(i=1;i<=n;i++) {
			p[i]=p[i]+p[i-1];
			min+=p[i];
		}
		System.out.println(min);
	}
}

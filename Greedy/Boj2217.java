package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Boj2217 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] rope=new int[N+1];
		int max=0;
		int w=0;
		for(int i=1;i<=N;i++) {
			rope[i]=sc.nextInt();
		}
		Arrays.sort(rope);
		
		for(int i=0;i<=N;i++) {
			w=rope[N-i]*(i+1);
			if(max<w) {
				max=w;
			}
		}
		System.out.println(max);
	}
}

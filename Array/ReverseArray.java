package Array;

import java.util.Scanner;

public class ReverseArray {

	//배열 요소 a[idx1]과 a[idx2]의 값을 바
	static void swap(int[] a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	//reverse Array
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++)
			swap(a,i,a.length-i-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Typing the Number of Array");
		int num=sc.nextInt();
		
		int[] x=new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"]:");
			x[i]=sc.nextInt();
		}
		reverse(x);
		
		System.out.println("Result reversed");
		for(int i=0;i<num;i++)
			System.out.println("x["+i+"]="+x[i]);
	}
}

package Search;

import java.util.Scanner;

public class SeqSearch {
	static int seqSearch(int[] a,int n,int key) {
		int i=0;
		
		while(true) {
			if(i==n)
				return -1;
			if(a[i]==key)
				return i;
			i++;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("요솟수 :");
	int num=sc.nextInt();
	int[] x=new int[num];
	
	for(int i=0;i<num;i++) {
		System.out.println("x["+i+"]:");
		x[i]=sc.nextInt();
	}
	System.out.println("검색할 값:");
	int ky=sc.nextInt();
	int idx=seqSearch(x, num, ky);
	
	if(idx==-1)
		System.out.println("Empty");
	else
		System.out.println(ky+"is x=>["+idx+"]");
}
}

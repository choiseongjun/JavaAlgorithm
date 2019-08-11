package HomeWork;

import java.util.Scanner;

/*
 * 접근한 방식은  먼저 배열 선언후 랭크배열을 받았다. 
 **/
public class boj7568 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		/*
		 * 몸무게,키,순위 배열을 입력받는다.
		 * */
		int[] rank=new int[N];
		int[] a=new int[N];
		int[] b=new int[N];
		//초기화를  시킨다 
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			rank[i]=1;
			for(int j=0;j<N;j++) {
				if(a[i]<a[j] || b[i]<b[j]) {
					rank[i]++;
				}
			}
			
		}
		for(int i=0;i<N;i++) {
			System.out.println(rank[i]);
		}
	}
}

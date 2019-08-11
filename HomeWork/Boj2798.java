package HomeWork;

import java.util.Scanner;
/*
 * 3중 포문을 잘 이해하고 접근하면 된다 
 * */
public class Boj2798 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int T=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int result=Integer.MAX_VALUE;//맥스값 받기위해서..,.
		for(int i=0;i<N;i++) {//1번째 
			for(int j=i+1;j<N;j++) {//2번쨰  
				for(int k=j+1;k<N;k++) {//3번째 
					if(arr[i]+arr[j]+arr[k]<=T) {
						result=arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		System.out.println(result);
	}
}

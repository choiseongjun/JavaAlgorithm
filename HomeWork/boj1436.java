package HomeWork;

import java.util.Scanner;

public class boj1436 {

	  public static void main(String[] args) throws Exception {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int i=665;
	        int cnt=0;
	        while(true) {
	        	if(String.valueOf(++i).contains("666")) {
	        		cnt++;
	        	}
	        	if(cnt==n) break;
	        }
	        System.out.println(i);
	    }
	 
}

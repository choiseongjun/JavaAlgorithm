package HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj1436 {

	  public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	        int N = Integer.parseInt(br.readLine());
	        int num = 0;
	 
	        while(N > 0) {
	            num++;
	            String str = Integer.toString(num);   // int to string 형변환
	 
	            if(str.contains("666")) 
	                N--;
	        }
	 
	        System.out.println(num);
	    }
}

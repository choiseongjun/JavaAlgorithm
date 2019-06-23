package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4307 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int T=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine());
			int length=Integer.parseInt(st.nextToken());
			int antCnt=Integer.parseInt(st.nextToken());
			
			
			int min=Integer.MIN_VALUE;
			int max=Integer.MIN_VALUE;
			
			for(int j=0;j<antCnt;j++) {
				st=new StringTokenizer(br.readLine());
				int ant=Integer.parseInt(st.nextToken());
				
				int antMin=Math.min(ant, length-ant);
				int antMax=Math.max(ant, length-ant);
				
				min=Math.max(min,antMin);
				max=Math.max(max,antMax);
			}
			System.out.println(min+","+max);
		}
		
	}
}

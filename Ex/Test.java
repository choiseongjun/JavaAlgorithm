package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public static int solution(int[] rank) {
			
			HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
			int cnt=0;
			Sort(rank);
			for(int i=0;i<rank.length;i++) {
				System.out.print(rank[i]+",");
			}
			
//			ArrayList<Integer> list = new ArrayList<>();
//			for(int i=0; i<rank.length; i++) {
//				list.add(rank[i]);
//			}
//			
//			for(int i : list ) {
//				System.out.println(i);
//			}
			return 12;
		}
//
private static void Sort(int[] rank) {

		int tmp=0;
		for(int i=0;i<rank.length;i++) {
			for(int j=1;j<rank.length-1;j++) {
				if(rank[j]>rank[i]) {
					tmp=rank[i];
					rank[i]=rank[j];
					rank[j]=tmp;
				}
			}
		}
		
	}

// driver program 
	public static void main(String[] args) {
		int[] ranks = {3,4,3,0,2,2,3,0,0 };
		System.out.println(solution(ranks));
	}
}

package Array;

import java.util.Arrays;

public class EastSoftOne {

	public static int solution(int[] rank) {
		
		
		int cnt=0;
		sort(rank);
		for(int i=0;i<rank.length-1;i++) {
			System.out.println(rank[i]);
			if(rank[i+1]-rank[i]==1) {
				for(int j=0;j<rank.length;j++) {
					if(rank[i]==rank[j]) {
						cnt++;
					}
				}
			}
		}
		
		return cnt;		
	}
	private static void sort(int[] rank) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		int[] ranks = {3,4,3,0,2,2,3,0,0 };
		
		System.out.println(solution(ranks));
//		EastSoftOne es=new EastSoftOne();
//		es.solution(ranks);
	}
}

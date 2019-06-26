package Greedy;

public class Eastone {

	public static int solution(int[] rank) {
		int sum = 0;
		int cnt=0;
		for (int i = 0; i < rank.length; i++) {
			if(rank[i+1]-rank[i]==1) {
			
				System.out.print(rank[i++]);
//				sum+=rank[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] ranks = {4,4,3,3,1,0};
		System.out.println(solution(ranks));
	}
}

package DP;

public class ClimbtheStair {

	public static int minCostClibingStairs(int[] cost) {
		int case1=0,case2=0,current;
		for(int i=cost.length;i>=0;i--) {
			current=cost[i]+Math.min(case1, case2);
			case2=case1;
			case1=current;
		}
		return Math.min(case1, case2);
	}
	public static void main(String[] args) {
		
	}
}

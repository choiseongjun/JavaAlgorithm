package DP;

public class MinimumFallingPathSum {

	 public static int minFallingPathSum(int[][] A) {
	        int n = A.length;
	        if (n==1) return A[0][0];
	        if (n<1) return 0;
	        for (int i=1; i<n; i++) {
	            for (int j=0; j<n; j++) {//Find the min sum from the the previous neighbors
	                if (j==0) A[i][j] += Math.min(A[i-1][j],A[i-1][j+1]); //The first element of each row has only one neighbor
	                else if (j==n-1) A[i][j] += Math.min(A[i-1][j],A[i-1][j-1]); //The last element of each row has only on neighbor
	                else A[i][j] += Math.min(A[i-1][j-1],Math.min(A[i-1][j],A[i-1][j+1])); //All other elements have two neighbors
	            }
	        }
	        
	        int min = Integer.MAX_VALUE;
	        
			//Find min sum on the last row
	        for(int j=0; j<n; j++) {
	            min = Math.min(min,A[n-1][j]);
	        }
	        
	        return min;
	    }
	public static void main(String[] args) {
		

		int[][] A= {{1,2,3}
					,{4,5,6}
					,{7,8,9}};
		System.out.println(minFallingPathSum(A));
	}
}

package DP;

public class Knapsack {

	private int numOfItems;
	private int capacityOfKnapsack;
	private int[][] knapsackTable;
	private int totalBenefit;
	private int[] weights;
	private int[] values;
	
	public Knapsack(int numOfItems, int capacityOfKnapsack, int[][] knapsackTable, int totalBenefit, int[] weights,
			int[] values) {
		this.numOfItems = numOfItems;
		this.capacityOfKnapsack = capacityOfKnapsack;
		this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
		this.totalBenefit = totalBenefit;
		this.weights = weights;
		this.values = values;
	}
	public void solve() {
		
		for(int i=1;i<numOfItems+1;i++) {
			for(int w=1;w<capacityOfKnapsack+1;w++) {
				
				int notTakingItem=knapsackTable[i-1][w];
				int takingItem=0;
				if(weights[i]<w) {
					takingItem=values[i]+knapsackTable[i-1][w-weights[i]];
				}
				
				knapsackTable[i][w]=Math.max(notTakingItem, takingItem);
			}
		}
		totalBenefit=knapsackTable[numOfItems][capacityOfKnapsack];
	}
	
	
}

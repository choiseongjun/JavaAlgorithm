package Stack;

public class StockPrice {
	 public static int[] solution(int[] prices) {
	      int len=prices.length;
		        int[] answer = new int[len];

		        for(int start=0;start<len-1;start++) {
		        	for(int end=start+1;end<len;end++) {
		        		if(prices[start]>prices[end]||end==len-1) {
		        			System.out.println(end+","+start);
		        			answer[start]=end-start;

		        			break;
		        		}
		        	}
		        }
		       
		        return answer;
	    }
	 public static void main(String[] args) {
		int[] prices= {1, 2, 3, 2, 3};
		System.out.println(solution(prices));
	}
}

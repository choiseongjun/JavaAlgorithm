package Sort;

import java.util.Arrays;

public class PrgKvalue {
	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};

	        answer = new int[ commands.length ];

	        for( int i=0; i<commands.length; i++ )
	        {
	            int startPoint = commands[i][0];
	            int endPoint = commands[i][1];
	            int answerPoint = commands[i][2];

	            int[] partOfArray = new int[ endPoint - startPoint +1 ];
	
	            int idx = 0;
	            for( int j=startPoint-1; j<endPoint; j++ )
	            {
	                partOfArray[idx] = array[j];
	                idx++;
	            }

	            Arrays.sort( partOfArray );

	            answer[i] = partOfArray[ answerPoint-1 ];
	        }
	        for(int i=0;i<10;i++) {
	        	System.out.println(answer[i]);
	        }
	        return answer;
	    }
    public static void main(String[] args) {
    	int[] array= {1, 5, 2, 6, 3, 7, 4};
    	int[][] commands= {	{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    	System.out.println(solution(array,commands));
	}
}

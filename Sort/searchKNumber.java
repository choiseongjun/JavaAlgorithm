package Sort;

import java.util.Arrays;

public class searchKNumber {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0 ;
 
        for(int i = 0 ; i < commands.length ; i++)
        {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
       
            int[] tmp = new int[end - start + 1];
            int a = 0;
            for(int j = start - 1 ; j <= end-1 ; j++)
                tmp[a++] = array[j];
 
            Arrays.sort(tmp);
            answer[index++] = tmp[k-1];
        }
        return answer;
    }

	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(solution(array,commands));
	}
}

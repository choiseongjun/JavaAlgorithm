package String;

import java.util.Arrays;

public class stringTest {
	 public static int solution(int[] people, int limit) {
		  Arrays.sort(people);
		  int answer=0;
	      int i=0,j=people.length-1;
	      while(i<j) {
	    	  if(people[i]+people[j]<=limit) i++;answer++;
	    	  j--;
	      }
	      return answer;
	 }
    	public static void main(String[] args) {
		int[] arr= {70,80,50,80};
		System.out.println((solution(arr,100)));
	}
}

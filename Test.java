import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String[] s= {"sun", "bed", "car"};
		int n =1;
		System.out.println(solution(s,n));
		
	}
	public static String[] solution(String[] strings, int n) {
	      for (int i = 0; i < strings.length - 1; i++) {
	    	  	System.out.println(strings[i]);
	            for (int j = i + 1; j < strings.length; j++) {
	            	System.out.println(strings[j]);
//	                if (strings[i].charAt(n) > strings[j].charAt(n)) {
//	                    String temp = strings[i];
//	                    strings[i] = strings[j];
//	                    strings[j] = temp;
//	                } else if (strings[i].charAt(n) == strings[j].charAt(n)) {
//	                    if (strings[i].compareTo(strings[j]) > 0) {
//	                        String temp = strings[i];
//	                        strings[i] = strings[j];
//	                        strings[j] = temp;
//	                    }
//	                }
	            }
	        }
	      
	        String[] answer = strings;
	      return answer;
	}
}

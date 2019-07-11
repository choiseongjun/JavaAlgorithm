package HashTable;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

For each such occurrence, add "third" to the answer, and return the answer.

Example 1:

Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]
Example 2:

Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]
 * */
public class leetcode1078 {
	   public static String[] findOcurrences(String text, String first, String second) {
	        
	        List<String> answer = new ArrayList<>();
	        
	        String[] words = text.split(" ");
	        for(int i=0 ; i<words.length-2 ; i++){
	            if(words[i].equals(first) && words[i+1].equals(second)){
	                answer.add(words[i+2]);
	            }
	        }
	        return answer.toArray(new String[0]);
	    }
	public static void main(String[] args) {
		String text="alice is a good girl she is a good student";
		String first="a";
		String second="good";
		System.out.println(findOcurrences(text, first, second));
	}
}

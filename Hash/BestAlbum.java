package Hash;

import java.util.Arrays;

public class BestAlbum {

	 public static String solution(String[] participant, String[] completion) {
		 	
		 	Arrays.sort(participant);
		 	Arrays.sort(completion);
		 	int i;
		 	for(i=0;i<completion.length;i++) {
		 		if(!(completion[i].contains(participant[i]))) return participant[i];
		 	}
		 
	        return participant[i];
	 }
	 public static void main(String[] args) {
		 String[] participant = {"leo", "kiki", "eden"};
		 String[] completion = {"kiki", "eden"};
		 System.out.println(solution(participant,completion));
	}
}

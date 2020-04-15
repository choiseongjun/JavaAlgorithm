
public class getmiddlevalue {

	 public static String solution(String word) {
		 System.out.println((word.length()-1) / 2);
		 return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
	 }
	public static void main(String[] args) {
		String s="qwer";
		System.out.print(solution(s));
	}
}

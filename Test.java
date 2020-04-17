import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String[] s= {"sun", "bed", "car"};
		int n =1;
		System.out.println(solution(s,n));
		
	}
	public static String[] solution(String[] strings, int n) {
		String temp ="";
		for(int i=0;i<strings.length-1;i++) {
			for(int j=i+1;j<strings.length;j++) {
				System.out.println(strings[j]);
			}
			
		}
		
		
		return strings;
	}
}

import java.util.Arrays;
import java.util.Scanner;

public class T {

	static int n;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n==solve(String.valueOf(i))) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	private static int solve(String num) {
		
		int len=num.length();
		int sum=Integer.parseInt(num);
			for(int i=0;i<len;i++) {
				System.out.println(num.charAt(i)-'0');
				sum+=num.charAt(i)-'0';
			}
		return sum;
	}


}

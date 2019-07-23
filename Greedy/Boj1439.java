package Greedy;

public class Boj1439 {

	public static void main(String[] args) {
		
		String S="0001100";
		char c = 0;
		for(int i=0;i<S.length();i++) {
			c=S.charAt(i);
			if(c=='0') {
				c='1';
			}else {
				c='0';
			}
		}
		System.out.print(c);
	}
}

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String n="ABCSD2348";
		char str[]=n.toCharArray();
		char tmp;
		System.out.println(n);
		int len=str.length;
		
		for(int i=0;i<len/2;i++) {
			tmp=str[i];
			str[i]=str[len-i-1];
			str[len-i-1]=tmp;
		}
		n=new String(str);
		System.out.println(n);
	}
}

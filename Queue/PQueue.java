package Queue;

import java.util.PriorityQueue;
import java.util.Stack;

public class PQueue {
	 
	public static void main(String[] args) {
		String n="QQWEE";
		char str[]=n.toCharArray();
		char tmp;
		int len=str.length;
		System.out.println(n);
		
		for(int i=0;i<len/2;i++) {
			tmp=str[i];
			str[i]=str[len-i-1];
			str[len-i-1]=tmp;
		}
		n=new String(str);
		System.out.println(n);
	}
}

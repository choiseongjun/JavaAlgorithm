package Recursion;
/*2가지 방식  */
public class Recursive {

	public int sumIterative(int n) {
		    //if n=10; 10+9+8 ... 10!
		int result=0;
		
		for(int i=1;i<=n;++i)
			result=result+i;
		
		return result;
	}
	public int sumRecursive(int n) {
		if(n==1) return 1;
		
		return n+sumIterative(n-1);
	}
}

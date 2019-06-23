package Recursion;

public class ThreeAlgorithm {

	public int factorial(int accumalate,int n) {
		
		//5!   ex) n!=n*(n-1)....*1;
		
		if(n == 1) return accumalate;
		
		return factorial(accumalate*n, n-1);
	}
	
	public int calculateFactorial(int n) {
		return factorial(1,n);
	}
}

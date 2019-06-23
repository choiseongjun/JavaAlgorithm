package Recursion;

public class fourApp {

	public static void main(String[] args) {
		int[] array= {1,5,3,8,9,10,-3};
		
		fourAlgorithm algo=new fourAlgorithm(array);
		System.out.println(algo.linearSearch(10));
	}
}

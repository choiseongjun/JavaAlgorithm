package Recursion;

public class GCDAlgorithm {

	public int gcdIterative(int num1,int num2) {
	
		
		while(num2!=0) {
			int temp=num2;
			num2=num1%num2; //module operatior! 3%2=1 
			num1=temp;
		}
		return num1;
	}
	
	public int gcdRecursive(int num1,int num2) {
		
		if(num2==0) return num1;
		
		return gcdIterative(num2, num1%num2);
	}
	
	public static void main(String[] args) {
		GCDAlgorithm algo=new GCDAlgorithm();
		System.out.println(algo.gcdRecursive(30, 100));
	}
}

package Array;

public class Mostvalue {

	public static void main(String[] args) {
		
		int[] data= {1,3,4,3,5};
		int mode=0;
		int[] index=new int[6];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<data.length;i++) {
			index[data[i]]++;
			System.out.println(index[data[i]]++);
		}
		
	}
}

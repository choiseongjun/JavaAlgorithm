package Array;

public class FrequnetValue {

	public static void main(String[] args) {
		int[] data= {1,3,4,3,5};
		int mode=0;
		int[] index=new int[6];
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<data.length;i++) {
			index[data[i]]++;
		}
		for(int i=0;i<index.length;i++) {
			if(max<index[i]) {
				max=index[i];
				mode=i;//최빈값
			}
		}
		  System.out.println("최빈값 : "+ mode +" , "+max+"번"); //3, 2번
	}
}

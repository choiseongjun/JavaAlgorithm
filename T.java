import java.util.Arrays;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,min=0,n=sc.nextInt(),arr[]=new int[n+1];
		
		for(i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		Sort(arr);
		for( i=1;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i];
			min+=arr[i];
		}
	
	}

	private static void Sort(int[] arr) {

		int tmp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		}
	}
}

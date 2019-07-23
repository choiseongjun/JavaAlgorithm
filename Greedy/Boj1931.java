package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Boj1931 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] arr=new int[N][2];
		
		for(int i=0;i<N;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] start, int[] end) {
				//start[0], end[0] 배열은 arr[][] 의 첫번째 라인(시작시간)이다.
                //start[1], end[0] 배열은 arr[][] 의 두번째 라인(종료시간)이다.
				if(start[1]==end[1])
				{
					return Integer.compare(start[0], end[0]);
				}
				return Integer.compare(start[1], end[1]);
			}
			
			
		});
		int cnt=0;
		int end=-1;
		for(int i=0;i<N;i++) {
			if(arr[i][0]>=end) {
				end=arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

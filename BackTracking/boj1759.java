package BackTracking;

import java.util.Scanner;

public class boj1759 {

	static int row;
	static int col;
	static int[][] arr;
	
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,-1,0,1};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		row = sc.nextInt();
		col = sc.nextInt();
		arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			String str=sc.nextLine();
			for(int j=0;j<col;j++) {
				arr[i][j]=(int)str.charAt(j)-65;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}

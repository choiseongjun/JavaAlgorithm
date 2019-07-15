package Graph;

import java.util.Scanner;

/*
 * 가중치 없는 방향 그래프 G가 주어졌을 때, 
 * 모든 정점 (i, j)에 대해서, i에서 j로 가는 경로가 있는지 없는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정점의 개수 N (1 ≤ N ≤ 100)이 주어진다. 
둘째 줄부터 N개 줄에는 그래프의 인접 행렬이 주어진다.
 i번째 줄의 j번째 숫자가 1인 경우에는 i에서 j로 가는 간선이 존재한다는 뜻이고, 0인 경우는 없다는 뜻이다.
  i번째 줄의 i번째 숫자는 항상 0이다.
 입력: 
3
0 1 0
0 0 1
1 0 0
출력:
1 1 1
1 1 1
1 1 1
 * */
public class Boj11403 {

	static int[][] map;
	static int N;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();
		sc.nextLine();
		map=new int[N][N];
		check=new boolean[N];
		for(int i=0;i<N;i++) {
			String str=sc.nextLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j)-'0';
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

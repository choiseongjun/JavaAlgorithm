package Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2146 {

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int n;

	static int[][] map;
	static boolean[][] check;
	static int[][] bridge;

	static Queue<Node> q = new LinkedList<>();
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n][n];
		check = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && !check[i][j]) {
					Numbering_BFS(i, j, ++count);
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]!=0) {
					//섬의 인덱스를 큐에 저장
					q.add(new Node(i,j));
				}
			}
		}
		bridge=new int[n][n];
		check=new boolean[n][n];
	}

	private static void Numbering_BFS(int i, int j, int k) {

	}
}

class Node {
	int x, y;

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

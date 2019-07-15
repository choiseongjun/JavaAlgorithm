package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


/*
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
 * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
 *  어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 *  4 5 1   <정점 간선 정점의 번호
	1 2
	1 3
	1 4
	2 4
	3 4
 * */
public class Boj1260 {

	static int m, n, v;
	static int[][] map;
	static boolean[] check;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y] = map[y][x] = 1;
		}
		check = new boolean[n + 1];
		dfs(v);
		System.out.println();
		check=new boolean[n+1];
		bfs(v);
	}

	private static void dfs(int v) {

		System.out.print(v + " ");
		check[v] = true;
		for (int i = 1; i <= n; i++) {
			if (map[v][i] == 1 && !check[i]) {
				dfs(i);
			} 
		}
	}
	private static void bfs(int v) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v);
		check[v]=true;
		while(!q.isEmpty()) {
			int next=q.poll();
			System.out.print(next+" ");
			for(int i=0;i<=n;i++) {
				if(map[next][i]==1&&!check[i]) {
					q.add(i);
					check[i]=true;
				}
			}
		}
		
	}
}

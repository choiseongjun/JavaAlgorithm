package Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test5 {

	static int N,M;
	static int V;
	static boolean[] visit;
	static int[][] map;
	
	public static void main(String args[]) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		V=Integer.parseInt(st.nextToken());
		map=new  int[N+1][N+1];
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			map[a][b]=map[b][a]=1;
		}
		visit=new boolean[N+1];
		dfs(V); 
		System.out.println();
		visit=new boolean[N+1];
		bfs(V);
	}

	private static void bfs(int v) {

		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v);
		visit[v]=true;
		while(!q.isEmpty()) {
			int next=q.poll();
			System.out.print(next+",");
			for(int i=1;i<=N;i++) {
				if(map[next][i]==1&&!visit[i]) {
					q.add(i);
					visit[i]=true;
				}
			}
		}
		
	}

	private static void dfs(int v) {

		System.out.print(v + " ");
		visit[v] = true;
		for (int i = 1; i <= N; i++) {
			if (map[v][i] == 1 && !visit[i]) {
				dfs(i);
			} 
		}
	}
}

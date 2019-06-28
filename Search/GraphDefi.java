package Search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class GraphDefi {

	static int[][] graph;
	static boolean[] visited;
	static int N;
	static int E;
	static int startPoint;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		graph = new int[1001][1001];
		E = sc.nextInt();
		visited = new boolean[10001];
		startPoint = sc.nextInt();

		int a, b;

		for (int i = 1; i < E; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			graph[a][b] = graph[b][a] = 1;
		}
		dfs(startPoint);

		for (int j = 1; j < N; j++) {
			visited[j] = false;
		}
		System.out.println();
		bfs(startPoint);
	}

	public static void bfs(int i){
		  
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(i);
        visited[i] = true;
        System.out.print(i+" ");
          
        int temp;
        while(!q.isEmpty()){
            temp = q.poll();
            for(int j=0; j<N+1; j++){
                if(graph[temp][j]==1&&visited[j]==false){
                    q.offer(j);
                    visited[j]=true;
                    System.out.print(j+" ");
                }
            }                       
        }
    }



	private static void dfs(int startPoint) {

		visited[startPoint] = true;

		System.out.println(startPoint + " ");
		
		for (int j = 1; j <= N; j++) {
			if (graph[startPoint][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}
	
}

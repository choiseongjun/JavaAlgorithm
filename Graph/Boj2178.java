package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj2178 {

	static int[][] map;
	static boolean[][] visited;
	static int N;
	static int M;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		visited = new boolean[N][M];
		map = new int[N][M];

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
				visited[i][j] = false;
			}
		}
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N - 1][M - 1]);
	}

	public static void bfs(int x, int y) {

		Queue<Cor> q = new LinkedList<Cor>();
		q.add(new Cor(x, y));
		while (!q.isEmpty()) {
			Cor d = q.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				if (visited[nextX][nextY] || map[nextX][nextY] == 0) {
					continue;
				}
				//다음에 방문할 좌표를 큐에 넣음
				q.add(new Cor(nextX, nextY));
				//다음방문할 장소로 +1간다
				map[nextX][nextY] = map[d.x][d.y] + 1;
				//다음 좌표는 방문 표시
				visited[nextX][nextY] = true;
			}
		}
	}
}

class Cor {

	int x, y;

	Cor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
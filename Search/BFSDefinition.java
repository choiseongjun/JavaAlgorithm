package Search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSDefinition {

	static int[][] ad;
	static boolean[] visit;
	static int Ne, Nv;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Nv = sc.nextInt();
		Ne = sc.nextInt();
		ad = new int[Nv + 1][Nv + 1];
		visit = new boolean[Nv + 1];

		for (int i = 0; i < Ne; i++) {
			int t1, t2;
			t1 = sc.nextInt();
			t2 = sc.nextInt();

			ad[t1][t2] = ad[t2][t1] = 1;
		}
		bfs(1);
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(i);
		visit[i] = true;

		while (!q.isEmpty()) {
			int tmp = q.poll();
			System.out.println(tmp);
			for (int j = 0; j <= Nv; j++) {
				if (ad[tmp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
}

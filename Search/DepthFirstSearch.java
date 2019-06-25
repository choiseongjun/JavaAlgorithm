package Search;

import java.util.Scanner;

public class DepthFirstSearch {

	static int vertex;// 정점의 개수
	static int startVertex;// 시작 정점
	static int[][] vertexMap;// 인접 행렬 셋
	static int[] vertexVisit;// 정점 방문 여부 체크
	static int vt1, vt2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vertex = sc.nextInt();// 정점의 개수 입력
		startVertex = sc.nextInt();
		vertexMap = new int[vertex + 1][vertex + 1];// 시작정점을 +1로 시작하기 위함
		vertexVisit = new int[vertex + 1];

		while (true) {
			vt1 = sc.nextInt();
			vt2 = sc.nextInt();

			if (vt1 < 0 && vt2 < 0)
				break;
			vertexMap[vt1][vt2] = vertexMap[vt2][vt1] = 1;
			// 정점 vt1과 vt2가 연결되었음을 표기
			// 인접행렬의 내용을 이해하면 위에 코드를 이해할 수 있습니다.
			// 예를 들어 1정점 2정점이 연결되었으면 [1][2] 와 [2][1] 배열의 자리가 1이된다.
		}

		dfs(startVertex);
	}

	private static void dfs(int start) {
		vertexVisit[start] = 1;

		for (int i = 1; i <= vertex; i++) {
			if (vertexMap[start][i] == 1 && vertexVisit[i] == 0) {
				System.out.println(start + "->" + i + "로 이동합니다");
				dfs(i);
			}
		}
	}

}

package Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*미키의 뒷마당에는 특정 수의 양이 있다. 그가 푹 잠든 사이에 배고픈 늑대는 마당에 들어와 양을 공격했다.

마당은 행과 열로 이루어진 직사각형 모양이다. 글자 '.' (점)은 빈 필드를 의미하며, 글자 '#'는 울타리를, 'o'는 양, 'v'는 늑대를 의미한다.

한 칸에서 수평, 수직만으로 이동하며 울타리를 지나지 않고 다른 칸으로 이동할 수 있다면, 두 칸은 같은 영역 안에 속해 있다고 한다. 마당에서 "탈출"할 수 있는 칸은 어떤 영역에도 속하지 않는다고 간주한다.

다행히 우리의 양은 늑대에게 싸움을 걸 수 있고 영역 안의 양의 수가 늑대의 수보다 많다면 이기게 된다. 그렇지 않다면 늑대가 그 지역 안의 모든 양을 먹는다.

맨 처음 모든 양과 늑대는 마당 안 영역에 존재한다.

아침이 도달했을 때 살아남은 양과 늑대의 수를 출력하는 프로그램을 작성하라.
첫 줄에는 두 정수 R과 C가 주어지며(3 ≤ R, C ≤ 250), 각 수는 마당의 행과 열의 수를 의미한다.

다음 R개의 줄은 C개의 글자를 가진다. 이들은 마당의 구조(울타리, 양, 늑대의 위치)를 의미한다.
하나의 줄에 아침까지 살아있는 양과 늑대의 수를 의미하는 두 정수를 출력한다.
*/
/*
 * 6 6
...#..
.##v#.
#v.#.#
#.o#.#
.###.#
...###
 * */
public class Boj3184 {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int v = 0;
	private static int o = 0;
	private static int R;
	private static int C;
	private static char map[][];
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		R = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);
		map = new char[R][C];
		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();

		int resulto = 0;
		int resultv = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] != '#' && map[i][j] != 'x') {
					v = o = 0;
					dfs(i, j);
					if (v >= o)
						resultv += v;
					else
						resulto += o;
				}
			}
		}
		bw.write(resulto + " " + resultv);
		bw.flush();
	}

	private static void dfs(int x, int y) {

		if (map[x][y] == 'o')
			o++;
		else if (map[x][y] == 'v')
			v++;
		map[x][y] = 'x';
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX < 0 || nextY < 0 || nextX >= R || nextY >= C || map[nextX][nextY] == '#'
					|| map[nextX][nextY] == 'x')
				continue;
			dfs(nextX, nextY);
		}
	}
}

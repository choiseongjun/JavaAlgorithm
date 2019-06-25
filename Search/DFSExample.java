package Search;

import java.util.Scanner;

public class DFSExample {

	static int[][] map;
	static int[] visit;
	static int min;
	static int map_size;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map_size = Integer.parseInt(sc.nextLine().trim());
		map = new int[map_size + 1][map_size + 1];
		min = map_size * map_size;

		for (int i = 0; i < map_size; i++) {
			for (int j = 0; j < map_size; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		depthfirstSearch(0, 0, 1);
	}

	private static void depthfirstSearch(int x, int y, int length) {

		if (x == map_size - 1 && y == map_size - 1) {
			if (min > length)
				min = length;
			return;
		}
		if (x > 0 && map[y][x - 1] == 1) {// 왼쪽
			depthfirstSearch(x - 1, y, length + 1);
		}
		if (x < map_size && map[y][x + 1] == 1) {// 오른쪽
			depthfirstSearch(x + 1, y, length + 1);
		}
		if (y < map_size && map[y + 1][x] == 1) {
			depthfirstSearch(x, y + 1, length + 1);
		}
		if (y > 0 && map[y - 1][x] == 1) {
			depthfirstSearch(x, y - 1, length + 1);
		}

		map[y][x] = 1;
	}

}

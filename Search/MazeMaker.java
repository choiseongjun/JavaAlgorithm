package Search;

import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {

	public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {

		int max = 0;
		int width = maze[0].length();
		int height = maze.length;
		int[][] board = new int[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				board[i][j] = 1;
			}
		}
		board[startRow][startCol] = 1;

		Queue<Integer> queueX = new LinkedList<Integer>();
		Queue<Integer> queueY = new LinkedList<Integer>();
		queueX.add(startCol);
		queueY.add(startRow);

		while (!queueX.isEmpty()) {

			int x = queueX.poll(), y = queueY.poll();

			for (int i = 0; i < moveRow.length; i++) {
				int nextX = x + moveCol[i], nextY = y + moveRow[i];

				if (0 <= nextX && nextX < width && 0 <= nextY && nextY < height && board[nextX][nextY] == -1
						&& maze[nextY].charAt(nextX) == '.') {
					board[nextY][nextX] = board[x][y] + 1;

					queueX.add(nextX);
					queueY.add(nextY);
				}
			}
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				if (maze[i].charAt(j) == '.' && board[i][j] == -1)
					return -1;
				max = Math.max(max, board[i][j]);

			}
		}
		return max;
	}

	public static void main(String[] args) {
		String[] maze = { "...", "...", "..." };
		int startRow = 0;
		int startCol = 1;
		int moveRow[] = { 1, 0, -1, 0 };
		int moveCol[] = { 0, 1, 0, -1 };
		MazeMaker ma = new MazeMaker();
		System.out.println(ma.longestPath(maze, startRow, startCol, moveRow, moveCol));
	}
}

package Array;

import java.util.Stack;

public class FriendCircles {

	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public int findCircleNum(int[][] M) {
		int count = 0;
		boolean[] visited = new boolean[M.length];
		Stack<Point> stack = new Stack<>();
		for (int i = 0; i < M.length; i++) {
			if (! visited[i]) {
				for (int j = M.length - 1; j >= 0; j--) stack.push(new Point(i, j));
				while (!stack.isEmpty()) {
					Point o = stack.pop();
					if (M[o.x][o.y] == 1 && !visited[o.y]) {
						visited[o.y] = true;
						if (o.x != o.y) 
                            for (int j = M.length - 1; j >= 0; j--) stack.push(new Point(o.y, j));
					}
				}
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[][] M= {{1,1,0},{1,1,0},{0,0,1}};
		FriendCircles fr=new FriendCircles();
		System.out.println(fr.findCircleNum(M));;
	}
}

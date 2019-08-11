package BFS;import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	 public static int orangesRotting(int[][] grid) {
	        if(grid == null || grid.length == 0) return 0;
	        int m = grid.length; 
	        int n = grid[0].length;
	        Queue<int[]> queue = new LinkedList<>(); 
	        int fresh = 0;
	        int mins = 0;
	        int[][] dirs = {{0,1}, {0,-1}, {-1, 0}, {1,0}};
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if(grid[i][j] == 2)
	                    queue.offer(new int[] {i,j});
	                else if(grid[i][j] == 1)
	                    fresh++;
	            }
	        }
	        while(!queue.isEmpty() && fresh > 0) {
	            int size = queue.size();
	            for(int i = 0; i < size; i++){
	                int[] point = queue.poll();
	                for(int[] dir : dirs){
	                    int x = point[0] + dir[0];
	                    int y = point[1] + dir[1];
	                    
	                    if(x < 0 || y < 0 ||x >= m || y >= n || grid[x][y] != 1) continue;
	                    queue.offer(new int[] {x,y});
	                    grid[x][y] = 2;
	                    fresh--;
	                }
	            }
	            mins++;
	        }
	        return fresh > 0 ? -1 : mins;
	    }
	public static void main(String[] args) {
		int[][] grid= {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(grid));
	}
}

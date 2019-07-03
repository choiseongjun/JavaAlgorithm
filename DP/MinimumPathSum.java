import java.util.PriorityQueue;

/**
 * 64. Minimum Path Sum Medium
 * 
 * 1430
 * 
 * 41
 * 
 * Favorite
 * 
 * Share Given a m x n grid filled with non-negative numbers, find a path from
 * top left to bottom right which minimizes the sum of all numbers along its
 * path.
 * 
 * Note: You can only move either down or right at any point in time.
 */
class MinimumPatghSum{
    public static int minPathSum(int[][] grid) {
        return recur(grid, new boolean[grid.length][grid[0].length],0,0); 
    }
    
    public static int recur(int[][] grid, boolean[][] visited, int col, int row) {
        if (visited[col][row]) return grid[col][row];
        visited[col][row] = true;
        
        int res = 9999; 
        if (row+1 <= grid[0].length-1) res = Math.min(res, recur(grid,visited,col,row+1)); 
        if (col+1 <= grid.length-1) res = Math.min(res, recur(grid,visited,col+1,row));

        grid[col][row] = (res == 9999) ? grid[col][row] : grid[col][row] + res;            
        return grid[col][row];
    }
    public static void main(String[] args){

        int[][] grid=  {{1,3,1},
                        {1,5,1},
                        {4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
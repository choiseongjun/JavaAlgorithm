package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
/*<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을,
 *  0은 집이 없는 곳을 나타낸다. 
 *  철수는 이 지도를 가지고 연결된 집들의 모임인 단지를 정의하고,
 *   단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 
 *   혹은 아래위로 다른 집이 있는 경우를 말한다.
 *    대각선상에 집이 있는 경우는 연결된 것이 아니다.
 *     <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 
 *     지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
입력
첫 번째 줄에는 지도의 크기 N(정사각형이므로 가로와 세로의 크기는 같으며 5≤N≤25)이 입력되고, 그 다음 N줄에는 각각 N개의 자료(0혹은 1)가 입력된다.
 *  
 *  
 *  7
0110100
0110101
1110101
0000111
0100000
0111110
0111000
 * */
public class Boj2667 {
	
	   public static int[] dirX = { 0, 0, -1, 1 };
	    public static int[] dirY = { -1, 1, 0, 0 };
	    public static int[][] map;
	    public static boolean[][] visited;
	    public static int N, apart = 1;
	    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	    public static void main(String[] args) throws Exception {
	 
	        N = Integer.parseInt(br.readLine());
	        map = new int[N][N];
	        visited = new boolean[N][N];
	 
	        for (int i = 0; i < N; i++) {
	            String str = br.readLine();
	            for (int j = 0; j < N; j++) {
	                map[i][j] = Integer.parseInt(str.charAt(j) + "");
	            }
	        }
	 
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (!visited[i][j] && map[i][j] != 0) {
	                    bfs(i, j);
	                    apart += 1;
	                }
	            }
	        }
	 
	        int[] ans = new int[apart -1];
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (map[i][j] != 0) {
	                    ans[map[i][j] - 1] += 1;
	                }
	            }
	        }
	        
	        
	        Arrays.sort(ans);
	        System.out.println(apart - 1);
	        for (int num : ans)
	            System.out.println(num);
	 
	    }
	 
	    public static void bfs(int startRow, int startCol) {
	 
	        Queue<Node> q = new LinkedList<Node>();
	        visited[startRow][startCol] = true;
	        map[startRow][startCol] = apart;
	        q.offer(new Node(startRow, startCol));
	 
	        while (!q.isEmpty()) {
	 
	            Node node = q.poll();
	 
	            for (int i = 0; i < 4; i++) {
	                int nr = node.row + dirX[i];
	                int nc = node.col + dirY[i];
	 
	                if (isBoundary(nr, nc) && !visited[nr][nc] && map[nr][nc] != 0) {
	                    visited[nr][nc] = true;
	                    map[nr][nc] = apart;
	                    q.offer(new Node(nr, nc));
	                }
	            }
	        }
	 
	    }
	 
	    public static boolean isBoundary(int row, int col) {
	        return (row >= 0 && row < N) && (col >= 0 && col < N);
	    }
	 
	}
	 
	class Node {
	 
	    int row;
	    int col;
	 
	    public Node(int row, int col) {
	        this.row = row;
	        this.col = col;
	    }
	 
	}

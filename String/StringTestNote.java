package String;

public class StringTestNote {
    public int findCircleNum(int[][] M) {

    	int circle=0;
    	boolean visited[]=new boolean[M.length];
    	for(int i=0;i<M.length;i++) {
    		if(!visited[i]) {
    			visited[i]=true;
    			dfs(M,visited,i);
    			circle++;
    		}
    	}
    	return circle;
    }
    
	private void dfs(int[][] m, boolean[] visited, int i) {
		visited[i]=true;
		
		for(int j=0;j<m[i].length;j++) {
			if(i!=j && !visited[j] && m[i][j]==1) {
				dfs(m, visited, j);
			}
		}
	}

	public static void main(String[] args) {
		 int[][] friend= {{1,1,0},{1,1,0},{0,0,1}};
		 StringTestNote fr=new StringTestNote();
         System.out.println(fr.findCircleNum(friend));
	}
}

package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj6603 {

    static int k;
    static int[] list;
    static boolean[] visited;
    static StringBuffer sb = new StringBuffer();
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            
            list = new int[k];
            visited = new boolean[k];
            
            for (int i = 0; i < k; i++) {
                list[i] = Integer.parseInt(st.nextToken());
            }
            
            for (int i = 0; i <= k-6; i++) {
                visited[i] = true;
                solve(i,1);
                visited[i] = false;
            }
            
            sb.append("\n");
        }
        System.out.print(sb.toString());
        
    }
 
    static void solve(int cur, int cnt) {
        
        if(cnt == 6) {
            for (int i = 0; i < k; i++) {
                if(visited[i]) 
                    sb.append(list[i]+" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = cur; i < k; i++) {
            if(visited[i]) continue;
            
            visited[i] = true;
            solve(i, cnt+1);
            visited[i] = false;
        }
    }
    
}

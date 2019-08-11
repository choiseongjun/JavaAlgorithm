package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Conference {

	static int N;
	static int[][] meeting;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		meeting=new int[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			meeting[i][0]=Integer.parseInt(st.nextToken());
			meeting[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(meeting,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o2[1]==o1[1]) {//이부분 체크..
					return o1[0]-o2[0];//시작값을빼버린다.
				}
				else return 0;
			}
		});
		System.out.println(solve());
	}

	static int solve() {
		int now=0;
		int cnt=1;
		
		for(int i=1;i<N;i++) {
			 //다음 회의의 시작시간이 현재 회의의 종료시간보다 작으면 continue
			if(meeting[i][0]<meeting[now][1]) continue;
			cnt++;
			now=i;
		}
		return cnt;
	
	}
}

package Search;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Bfs2667 {
	
	static int map[][];
	static int visit[][];
	static int dx[]= {0,0,-1,-1};
	static int dy[]= {-1,1,0,0};
	static int N;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=sc.nextInt();
		map=new int[N+1][N+1];
		visit=new int[N+1][N+1];
		
		for(int i=0;i<N;i++) {
			String input=sc.next();
			
			for(int j=0;j<input.length();j++) {
				map[i][j]=input.charAt(j)-48;
			}
		}
		
		bfs();
	}

	private static void bfs() {
			Queue<Integer> qx=new LinkedList<Integer>();
			Queue<Integer> qy=new LinkedList<Integer>();
			ArrayList<Integer> arr=new ArrayList<Integer>();
			
			for(int ti=0;ti<N;ti++) {
				
				int x,y;//현재위치
				int tx,ty;//상하좌우
				int hCnt;//하우스카운트
				
				for(int tj=0;tj<N;tj++) {
					hCnt=1;
					
					if(map[ti][tj]==1) {
						x=ti;
						y=tj;
						qx.add(x);
						qy.add(y);
						visit[x][y]=1;//방문 표시
						
						while(!qx.isEmpty() && !qy.isEmpty()) {
							x=qx.poll();
							y=qy.poll();
							
							for(int i=0;i<=3;i++) {
								tx=x+dx[i];
								ty=y=dy[i];
								//현재 위치를 기준으로 상하좌우의 위치가 집이 맞는지 체크
								if(tx>=0 && ty>=0 && tx<N&& ty<N) {
									if(map[tx][ty]==1 && visit[tx][ty]==0) {
										hCnt++;
										map[tx][ty]=0;
										qx.add(tx);
										qy.add(ty);
									}
									visit[tx][ty]=1;
								}
							}
						}
						arr.add(hCnt);
					}
				}
			}
			Collections.sort(arr);
			Iterator<Integer> itr=arr.iterator();
			System.out.println(arr.size());//단지수
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}
}

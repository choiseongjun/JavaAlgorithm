package Search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
 * 각 테스트 케이스의 첫째 줄에는 지도의 너비 w와 높이 h가 주어진다. 
 * w와 h는 50보다 작거나 같은 양의 정수이다.
 * 둘째 줄부터 h개 줄에는 지도가 주어진다. 1은 땅, 0은 바다이다.
1 1
0
2 2
0 1
1 0
 * */
public class Boj4963 {

	public static int island[][];
	public static int W, H;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int i, j;
		String line[];
		StringBuilder res = new StringBuilder();
		while (true) {
			int num = 0;
			line = in.readLine().split(" ");
			W = Integer.parseInt(line[0]);
			H = Integer.parseInt(line[1]);
			island = new int[H][W];
			if (W == 0 && H == 0)
				break;
			for (i = 0; i < H; i++) {
				line = in.readLine().split(" ");
				for (j = 0; j < W; j++)
					island[i][j] = Integer.parseInt(line[j]);
			}
			for (i = 0; i < H; i++)
				for (j = 0; j < W; j++)
					if (island[i][j] > 0) {
						num++;
						search(i, j);
					}
			res.append(num+"\n");
		}
		out.write(res.toString());
		out.close();
		in.close();
	}

	private static void search(int x, int y) {
		island[x][y]=0;
		int i;
		int ax[]= {0,1,1,1,0,-1,-1,-1};
		int ay[]= {1,1,0,-1,-1,-1,0,1};
		int dx,dy;
		
		for(i=0;i<8;i++) {
			dx=x+ax[i];
			dy=y+ay[i];
			
			if(isRange(dx,dy) && island[dx][dy]>0) search(dx,dy);
		}
	}

	private static boolean isRange(int x, int y) {
		return (0<=x&&x<H)&&(0<=y&&y<W);
	}
}

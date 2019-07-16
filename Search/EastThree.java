package Search;

import java.util.LinkedList;
import java.util.Queue;

public class EastThree {

	public int Solution(String[] B) {
		int count = 0, width = B[0].length(), row = 0, col = 0;

		for (int i = 0; i < B.length; i++) {
			if (B[i].contains("O")) {// 현재 행의 문자열이 "O"를 포함하는 경우
				row = i;
				col = B[i].indexOf("O"); // i행 문자열에서 "O"가 있는 위치의 인덱스
				break;
			}
		}
		// Integer[] index = { row, col };// 큐의 원소로 인덱스 형태의 1차원 배열 생성, index[0] : 행,
		// index[1] : 열
		Queue<EDot> q = new LinkedList<>();
		q.add(new EDot(row, col));

		while (!q.isEmpty()) {
			EDot d = q.poll();
			int i = d.x;
			int j = d.y;
			if (i - 2 >= 0) {
				if (j - 2 >= 0) {                   // 현재 열에서 2칸 왼쪽으로 이동했을 때, 필드에서 벗어나지 않았을 경우
                    if (B[i - 2].charAt(j - 2) == '.') {                        // 이동할 위치[i - 2, j - 2]에 'X'가 없는 경우
                        q.add(new EDot(i-2, j-2));                                 // Enqueue
                        if (B[i - 1].charAt(j - 1) == 'X') ++count;         // 현재 위치와 이동할 위치의 중간에 'X'가 있는 경우 count 증가
                    }
                }
				if (j + 2 < width) { // 현재 열에서 2칸 오른쪽으로 이동했을 때, 필드에서 벗어나지 않았을 경우
					if (B[i - 2].charAt(j + 2) == '.') {  // 이동할 위치[i - 2, j + 2]에 'X'가 없는 경우
						q.add(new EDot(i - 2, j + 2));// 새로 이동할 위치 확정 후 인덱스 배열로 생성
						if (B[i - 1].charAt(j + 1) == 'X') ++count; // 현재 위치와 이동할 위치의 중간에 'X'가 있는 경우 count 증가
					}
				}
			}
			
		}

		return count;
	}

	public static void main(String[] args) {
		String[] B = new String[6];
		B[0] = "..X...";
		B[1] = "......";
		B[2] = "....X.";
		B[3] = ".X....";
		B[4] = "..X.X.";
		B[5] = "...O..";
		EastThree solution = new EastThree();
		System.out.println(solution.Solution(B));
	}
}

class EDot {
	int x, y;

	EDot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

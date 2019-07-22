package BackTracking;

public class NQueensProblem {
	private final static int N = 8;
	private static int[] cols = new int[N + 1];
	static int cnt=0;
	public static void main(String[] args) {
		queens(0);
	}

	private static boolean queens(int level) {//level은 행
		if (!promising(level))
			return false;
		else if (level == N) {
			for (int i = 1; i <= N; i++)
				System.out.println("(" + i + ", " + cols[i] + ")");
			return true;
		}
		for (int i = 1; i <= N; i++) {
			cols[level + 1] = i;//cols[level]별 행에 i번쨰 열 놓겠다는거
			if (queens(level + 1))
				return true;
		}
		return false;
	}

	private static boolean promising(int level) {
		for (int i = 1; i < level; i++) {
			if (cols[i] == cols[level])
				return false;
			else if ((level - i) == Math.abs(cols[i] - cols[level]))//대각선 방향 체크임../ \ 이거 떄문에 절대값
				return false;
		}
		return true;
	}
}

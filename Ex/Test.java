package Ex;

import java.util.Scanner;

public class Test {


	static int n; // 입력 받을 변수
	static int sum; // 분해합
	static int constructor; // 생성자

	public static void main(String[] args) throws Exception {

		// n을 입력받고
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		// i를 1부터 n까지 증가시키면서 분해합이 n일 때를 찾는다
		for (int i = 1; i <= n; i++) {
			if (getSum(i) == n) {
				constructor = i; // 그 경우에 생성자는 i
				break;
			}
		}
		System.out.println(constructor); // 정답 출력
	}

	/*
	 * 분해합 구하는 함수 각 자리의 합을 인덱스 접근을 통한 charAt()으로 구하기 위해 String.valueOf()을 이용하여
	 * String으로 변환
	 */
	public static int getSum(int n) {
		String strN = String.valueOf(n);
		int lenOfN = strN.length();
		sum = n;

		for (int i = 0; i < lenOfN; i++) {
			sum += strN.charAt(i) - '0'; // char가 아닌 int로 계산하기 위해  -'0, '0' == 48
		}
		return sum;
	}

}

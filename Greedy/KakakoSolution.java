package Greedy;

public class KakakoSolution {

	public static boolean solution(int[] arr) {
		boolean answer=true;
		boolean check=true;
		int leng=arr.length;
		boolean[] cu=new boolean[leng+1];
		for(int i=0;i<leng;i++) {
			int temp=arr[i];
			if(temp>leng) return false;
			if(cu[temp]==true) {
			// - 배열에 해당 인덱스 값이 true면 중복된 값이므로 false를 return한다.
				return false;
			}else {
				cu[temp]=true;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 3, 2 };
		System.out.println(solution(arr));
	}
}

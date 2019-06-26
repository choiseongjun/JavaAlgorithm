package Greedy;

/*자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N=123이면 1+2+3 = 6 을 return 하면 됩니다.
제한사항
  N의 범위 : 100,000,000 이하의 자연수
입출력 예
 N
 answer 
 123
 6 
 987
 24 
입출력 예 설명
입출력 예 #1
문제의 예시와 같습니다.
입출력 예 #2
9+8+7 = 24이므로 24를 return 하면 됩니다*/

public class KakaoEasyTwo {
	  public static int solution(int n) {
	  
		  int answer=0;
		  
		  String str=Integer.toString(n);
		  
		  for(int i=0;i<str.length();i++) {
			  answer+=Integer.parseInt(String.valueOf(str.charAt(i)));
		  }
		  
		  
		  return answer;
	  }
	public static void main(String[] args) {

		int a= 123;
		
		System.out.println(solution(a));
	}
}
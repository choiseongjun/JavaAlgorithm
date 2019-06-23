package Stack.Problem;

import java.util.Stack;

/*programmers 쇠막대기 */
public class SteelStick {

	public static void main(String[] args) {
		String arrangement="()(((()())(())()))(())";
		System.out.println(solution(arrangement));
	}
	public static int solution(String arrangement) {
		int answer=0;
		
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<arrangement.length();i++) {
			
			if(arrangement.charAt('i')=='(') {
				stack.push(arrangement.charAt(i));
			}else {
				
				stack.pop();
				if(arrangement.charAt(i-1)=='(') {
					answer+=stack.size();
				}else {
					answer++;
				}
			}
		}
		return answer;
	}
}
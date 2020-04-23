package Stack;

import java.awt.Point;
import java.util.Stack;

class Tower{
	public int height;
	public int position;
	public Tower(int height,int position) {
		this.height=height;
		this.position=position;
	}
}
public class Top {
	 public static int[] solution(int[] heights) {
        
		 int[] answer=new int[heights.length];
		 Stack<Tower> stack =new Stack<Tower>();
		 
		 for(int i=heights.length-1;i>=0;i--) {
			
			 while(!stack.isEmpty() && heights[i]>stack.peek().height) {
				 answer[stack.pop().position] = i+1;
			 }
			 stack.push(new Tower(heights[i],i));
		 }
		 while(!stack.isEmpty()) {
			 answer[stack.pop().position] = 0;
		 }
		
		return answer;
    }
	
	public static void main(String[] args) {
		int[] heights= {6,9,5,7,4};
		System.out.println(solution(heights));
	}
	/*5(4) -> 4(7)
	 * 4(7) -> 2(9)
	 * 3(5)	-> 2(9)
	 * 2(9)
	 * 1(6)
	 * */
	
}

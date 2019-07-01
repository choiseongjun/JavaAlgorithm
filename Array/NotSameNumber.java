package Array;

import java.util.ArrayList;

/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 * */
public class NotSameNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        //arr과 temp가 값이 같다면 넘어가고 다르다면 그 값을 추가해준다.
        int temp = -1;
//        for(int i : arr) {
//            if(temp == i) {
//            } else {
//                a1.add(i);
//                temp = i;
//            }
//        } 
        for(int i=0;i<arr.length;i++) {
        	if(temp==arr[i]) {
        		
        	}else { 
        		a1.add(arr[i]);
        		temp=arr[i];
        	}
        }
        answer = new int[a1.size()];
        
        for(int k=0; k<a1.size(); k++) {
            answer[k] = a1.get(k);
            System.out.println(answer[k]);
        }
        return answer;
    }
    public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,3,2,4};
		NotSameNumber nt=new NotSameNumber();
		nt.solution(arr);
    }
}

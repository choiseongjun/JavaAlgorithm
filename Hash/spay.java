package Hash;

import java.util.HashMap;
import java.util.Map;
/*
 * 문제출처 : https://programmers.co.kr/learn/courses/30/lessons/42578
 * 이 문제는 경우의수를 구하는 문제다
 * 먼저 입는경우와 안입는경우를 생각하면 된다.
 * 각 종류별로 하나를 입거나, 안입거나의 선택지가 있기 때문에 옷의 개수에 안입는 선택지를 하나 추가한다.
 * 그리고 옷을 고르는 선택은 동시에 일어나는 일이기 때문에, 각 옷들을 곱해 경우의 수를 계산한다.
 * 이 때, 하나도 안입는 선택지는 없으므로 그 경우의 수 하나를 뺀다.
 * */
public class spay {
	public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int answer=1;
        for (int i = 0; i < clothes.length; i++) {
        	if(hm.containsKey(clothes[i][1])) {
        		hm.replace(clothes[i][1], hm.get(clothes[i][1])+1);
        	}else {
        		hm.put(clothes[i][1],1);
        	}
        	
        }
        
        for(String keys: hm.keySet()) {
        	System.out.println(keys);
    		answer *= (hm.get(keys) + 1);
    	}
        
        return answer-1;
    }
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban","headgear"} };
		System.out.println(solution(clothes));
	}
}

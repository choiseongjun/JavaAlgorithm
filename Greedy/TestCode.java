package Greedy;

import java.util.HashSet;


public class TestCode {
	 public static int[] solution(int n, String[] words) {
	        int[] answer = {0,0};
	        char wordStart; // 두번째 단어부터 첫번째 문자 저장을 위한 변수 선언
	        char wordEnd = words[0].charAt(words[0].length()-1); //처음 단어의 마지막 문자를 저장
	        HashSet<String> hashSet = new HashSet<String>(); 
	        hashSet.add(words[0]); // 첫단어를 해쉬셋에 저장
	        for(int i=1; i<words.length;i++){ 
	            hashSet.add(words[i]);
	            wordStart = words[i].charAt(0);
	            if(wordEnd!=wordStart || hashSet.size() != i+1){
	                answer[0] = (i%n)+1;
	                answer[1] = (i/n)+1;
	                break;
	            }
	            wordEnd= words[i].charAt(words[i].length()-1); //다음단어의 처음 알파벳 비교를 위해 이번 단어의 마지막 알파벳 저장
	        System.out.println(wordEnd);
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int n=3;
		String[] words= {"tank", "kick", "know", "wheel", "land","dream", "mother", "robot", "tank"};
		//System.out.println(solution(n, words));
		int[] answer= {0,0};
		char wordStart;
		char wordEnd=words[2].charAt(words[1].length()-1);
		System.out.println(wordEnd);
	}
}

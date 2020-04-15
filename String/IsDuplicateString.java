package String;

import java.util.HashMap;

public class IsDuplicateString {

	public static void main(String[] args) {
		System.out.println();
	}
	private static boolean isUnique(String str) {//아스키코드 
		if(str.length()>128) return false;
		boolean[] char_set =new boolean[128];
		for(int i=0;i<str.length();i++) {
			int val = str.charAt(i);
			if(char_set[val]) {//이전에 존재한 아스키값이라면
				return false;
			}
			char_set[val]= true;
		}
		return true;
	}
	private static boolean isUnique2(String str) {
		HashMap<Integer,Boolean> hashmap =new HashMap<Integer, Boolean>();
		for(int i=0;i<str.length();i++) {
			int c= str.charAt(i);
			if(hashmap.containsKey(c)) {
				return false;
			}
			hashmap.put(c, true);
		}
		return true;
	}
}

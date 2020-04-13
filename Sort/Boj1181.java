package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Boj1181 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<n; i++) set.add( sc.next() );
		String[] words = new String[set.size()];
		set.toArray(words);
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String a, String b) {
				int lenA = a.length();
				int lenB = b.length();
				if( lenA != lenB ) return lenA-lenB;
				return a.compareTo(b);
			}   
		});
		int len = words.length;
		for(int i=0; i<len; i++) System.out.println(words[i]);
	}
}

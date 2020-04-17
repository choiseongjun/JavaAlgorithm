package Hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class BestAlbum {

	public static int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        HashMap<Integer,Integer> pmap =new HashMap<Integer, Integer>();
	        HashMap<Integer,String> gmap =new HashMap<Integer, String>();
	        
	        for(int i=0;i<genres.length;i++) {
	        	pmap.put(i,plays[i]);
	        	gmap.put(i, genres[i]);
	        }
	        HashSet<String> gSet=new HashSet<String>();
	        for(int i=0;i<genres.length;i++) {
	        	gSet.add(genres[i]);
	        }
	        HashMap<Integer,String> coPlay=new HashMap<Integer, String>();
	        for(String x:gSet) {
	        	int cnt=0;
	        	for(int i=0;i<gmap.size();i++) {
	        		if(gmap.get(i).equals(x)) {
	        			cnt+=pmap.get(i);
	        		}
	        	}
	        	coPlay.put(cnt, x);
	        }
	        TreeMap sort =new TreeMap(coPlay);
	        String[] sortGenre =new String[gSet.size()];
	        int index = 0;
	        for(Object o : sort.keySet()) {
	        	sortGenre[index] = sort.get(o).toString();
	        	index++;
	        }
	       
	        
	        
	        return answer;
	    }
	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		System.out.println(solution(genres, plays));
	}
}

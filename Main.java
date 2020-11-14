import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Main{
	
	public static void main(String[] args) {
		String paragraph="Bob hit a ball, the hit BALL flew far after it was hit";
		String[] banned = {"hit"};
		
		Main main =new Main();
		String s = main.mostCommonWord(paragraph, banned);
	}
	public String mostCommonWord(String paragraph, String[] banned) {

		Set<String> banndWords=new HashSet<String>();
		for(String word:banned)
			banndWords.add(word);
		
		String ans="";
		int maxCnt=0;
		Map<String, Integer> wordCnt = new HashMap<String, Integer>();
		StringBuilder wordBuffer = new StringBuilder();
		char[] chars = paragraph.toCharArray();
		
		for(int i=0;i<paragraph.length();i++) {
			char currChar = chars[i];
			
			if(Character.isLetter(currChar)) {
				wordBuffer.append(Character.toLowerCase(currChar));
				if(i!=chars.length-1)
					continue;
				
			}
			
			if(wordBuffer.length()>0) {
				String word = wordBuffer.toString();
				
				if(!banndWords.contains(word)) {
					int newCnt=wordCnt.getOrDefault(word,0)+1;
					System.out.println(word);
					wordCnt.put(word,newCnt);
					if(newCnt>maxCnt) {
						ans=word;
						maxCnt=newCnt;
					}
				}
				wordBuffer = new StringBuilder();
			}
		}
        return ans;
    }
}
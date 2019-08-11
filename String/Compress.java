package String;

public class Compress {

	String compressBad(String str) {
	
		String compressedString="";
		int countConsecutive=0;
		for(int i=0;i<str.length();i++) {
			countConsecutive++;
			
			if(i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)) {
				compressedString+=""+str.charAt(i)+countConsecutive;
				countConsecutive=0;
			}
		}
		return compressedString.length()<str.length()?compressedString:str;
	}
	
	
	public static void main(String[] args) {
		
	}
}

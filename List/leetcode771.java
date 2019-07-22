package List;

public class leetcode771 {
	public static int numJewelsInStones(String J, String S) {
		int res=0;
		for(int i=0;i<S.length();i++){

			String tem=Character.toString(S.charAt(i));
			if(J.contains(tem)){
				res++;
			}

		}

		return res;
	}
	public static void main(String[] args) {
		String J = "aA", S = "AA";
		System.out.println(numJewelsInStones(J, S));
	}
}

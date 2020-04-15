package String;

public class URLEncode {

	public static void main(String[] args) {
		System.out.println(uriencode("Mr John Smith      ",13));
	}

	private static String uriencode(String str, int len) {

		return uriencode(str.toCharArray(), len);
	}

	private static String uriencode(char[] str, int len) {
		int spaces = 0;
		for (int i = 0; i < len; i++) {
			if (str[i] == ' ')
				spaces++;
		}
		int index = len + spaces * 2 - 1;
		for(int p = len-1;p>=0;p--) {//마지막부터 돌음
			if(str[p]==' ') {
				str[index--]='0';
				str[index--]='2';
				str[index--]='%';
			}else {
				str[index--] = str[p];
			}
		}
		return new String(str);
	}
}

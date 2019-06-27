package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MISPELL {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int total = cnt;

		while (cnt-- > 0) {
			String[] s = br.readLine().split(" ");
			char[] c = s[1].toCharArray();
			int b = Integer.parseInt(s[0]) - 1;
			
			String result = "";

			for (int i = 0; i < c.length; i++) {
				if (b != i)
					result += c[i];
			}
		}
	}
}

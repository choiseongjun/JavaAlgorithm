package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaxValue {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int maxNumber=0;
		int maxIdx=0;
		
		for(int i=1;i<=9;i++) {
			int number=Integer.parseInt(br.readLine());
			if(maxNumber<number) {
				maxIdx=i;
				maxNumber=number;
			}
		}
		bw.write(maxNumber + "\n");
		bw.write(String.valueOf(maxIdx));
		bw.flush();

		
	}
}

package Array;

import java.util.Scanner;

/*최빈수 구하기*/
public class FrequentValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] inputNum=new int[10];
		for(int i=0;i<10;i++) {
			inputNum[i]=sc.nextInt();
		}
		int[] mode=new int[10];
		
	//inputNum->1 2 2 3 1 4 2 2 4 3
		for(int i=0;i<10;i++) {
			mode[inputNum[i]]++;//mode[2]=4
		}
		int modeNum=0;//최빈수
		int modeCnt=0;//최빈수가 나온횟수
		
		for(int i=0;i<10;i++) {
			if(modeCnt<mode[i]) {
				modeCnt=mode[i];
				modeNum=i;
			}
		}
		System.out.println("최빈수는+"+modeNum+"cnt:"+modeCnt);
	}
}

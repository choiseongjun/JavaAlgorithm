package String;

public class PowerSet {
	 public static void main(String[] args) {
	        char[] data = {'a', 'b', 'c'};
	        int[] flag = new int[data.length];

	        powerSet(data, flag, 0);
	    }

	    static void powerSet(char[] data, int[] flag, int n) {
	    	//종료조건 (기저사례)
	        if (n == data.length) {
	            //출력을 위한 메소드
	            printData(data, flag);
	            return;
	        }

	        //포함을 시키는 경우
	        flag[n] = 1;
	        powerSet(data, flag, n + 1);

	        //포함을 시키지 않는 경우
	        flag[n] = 0;
	        powerSet(data, flag, n + 1);
	    }

	    static void printData(char[] data, int[] flag) {
	        for (int i = 0; i < flag.length; i++) {
	            if (flag[i] == 1) {
	                System.out.print(data[i] + "\t");
	            }
	        }
	        System.out.println();
	    }
}

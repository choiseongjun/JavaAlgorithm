package BackTracking;

public class Nqueen {
	static int count = 0;

	public static void main(String[] args) {

		int n = 4;
		int[] array = new int[n];

		nqueen(array, 0);
		System.out.println(count);
	}

	public static void nqueen(int[] array, int location) {

		if (array.length == location) {
			printChess(array);
			count++;
			return;
		}
		
		for(int i=0;i<array.length;i++) {
			array[location]=i;
			if(promissing(array,location))
				nqueen(array,location+1);
		}
	}
	/** 
	* 퀸이 배치될 수 있는지 확인 *
	*  * @param array *
	*   @param location *
	*    @return 
	*    */
	private static boolean promissing(int[] array, int location) {
		int curX=array[location];
		int curY=location;
		
		
		for(int i=0;i<location;i++) {
			
			int sX=array[i];
			int sY=i;
			
			//같은열이면 안됨
			if(sX==curX) {
				return false;
			}
			if(Math.abs(curX-sX)==Math.abs(curY-sY)) 
				return false;
		}
		
		return true;
	}

	private static void printChess(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int q = array[i];

			for (int j = 0; j < array.length; j++) {
				System.out.printf("%s ", (j == q) ? "Q" : "-");
			}
			System.out.println();
		}
		System.out.println();
	}
}

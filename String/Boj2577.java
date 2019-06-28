package String;

public class Boj2577 {

	public static void main(String[] args) {
		int a = 150;
		int b = 266;
		int c = 427;

		int result = a * b * c;
		int[] arr = new int[10];
		
		while (result != 0) {
			arr[result % 10]++;
			result = result / 10;//가장 우측 한자리 숫자 뽑아옴
		}
//		for (int i = 0; i < 10; i++)
//			System.out.println(arr[i]);
	}
}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int A = sc.nextInt();
//    int B = sc.nextInt();
//    int C = sc.nextInt();
//    sc.close();
//     
//    int[] counts = new int[10];
//    String input = String.valueOf(A * B * C);
//    for (int i = 0; i < input.length(); ++i) {
//        counts[input.charAt(i) - '0']++;
//    }
//     
//    for (int i = 0; i < counts.length; ++i) {
//        System.out.println(counts[i]);
//    }
//}
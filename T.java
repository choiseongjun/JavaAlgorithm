import java.util.ArrayList;

public class T {

	 public static void main(String[] args) {
		 String[][] strArr = new String[][] {{"1번", "1가을", "1하늘"}, {"2번", "2가을", "2하늘"}};

		 ArrayList<String[]> list3 = new ArrayList<String[]>();  


		 for(int i=0; i<strArr.length; i++)                          //입력

		    list3.add(new String[]{strArr[i][0], strArr[i][1], strArr[i][2]});



		 for(int i=0; i<list3.size(); i++)                            //출력
			 System.out.println(list3.get(i)[0] + "\t" + list3.get(i)[1] + "\t" + list3.get(i)[2]);
	 }


}

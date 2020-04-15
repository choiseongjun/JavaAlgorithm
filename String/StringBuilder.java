//package String;
//
///*
// * StringBuilder -async
// * StringBuffer - sync ->멀티쓰레드
// * */
//public class StringBuilder {
//
//	private char[] value;
//	private int size;
//	private int index;
//
//	public StringBuilder() {
//		size = 1;
//		value = new char[size];
//		index = 0;
//	}
//
//	public void append(String str) {
//		if (str == null)
//			str = "null";
//		int len = str.length();
//		ensureCapacity(len);
//		for (int i = 0; i < str.length(); i++) {
//			value[index] = str.charAt(i);//문자열을 돌면서 한자씩 넣어줌 
//			index++;//다음배열방을 가르킨다 
//		}
//	}
//
//	private void ensureCapacity(int len) {// 배열방의 크기를 늘려줌
//		if (index + len > size) {//현재 인덱스+문자열길이 합이 현재배열방 초과하면 
//			size = (size + len) * 2; //2배로 만들어줌 
//			char[] newValue = new char[size];//그 크기만 큼 새로운 배열방 만들어줌 
//			for (int i = 0; i < value.length; i++) {
//				newValue[i] = value[i];
//			}
//			value = newValue; //새로만든배열방이 새로운 값이 됨
//		}
//	}
//	public String toString() {
//		return new String(value,0,index); //현재 저장된 배열방 0번부터 index까지 반환
//	}
//
//	public static void main(String[] args) {
//		StringBuilder sb= new StringBuilder();
//		sb.append("sung");
//		sb.append("is");
//		sb.append(" pretty");
//		System.out.println(sb.toString());
//	}
//}

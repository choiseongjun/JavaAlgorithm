package Array;

/*
 * ArrayList 의 입력시간과 검색시간은 O(1)
 * */
public class ArrayList {

	private Object[] data;
	private int size;
	private int index;

	public ArrayList() {
		this.size = 1; // 어레이리스트 사이즈를 1로 선언한다
		this.data = new Object[this.size];
		this.index = 0; // 새데이터는 0번방에 들어감
	}

	public void add(Object obj) {
		if (this.index == this.size - 1) {// 방이 다 찼는지 비교
			doubling();
		}
		data[this.index] = obj;// 가져온데이터를 배열방 맨끝에 추
		this.index++;// 데이터가 하나 추가되었기에
	}

	public void doubling() {
		this.size = this.size * 2;// 사이즈를 2배 늘린다
		Object[] newData = new Object[this.size]; //현재 배열방을 2배 큰 사이즈로 늘린다
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];//현재 만든 배열방을 반복문을 돌면서 새배열방에 복사한다
		}
		this.data = newData;
	}
	public Object get(int i) throws Exception{
		if(i>this.index-1) {
			throw new Exception("ArrayIndexOutOfBount");
		}else if(i<0) {
			throw new Exception("Negative Value");
		}
		return this.data[i];
	}
	public void remove(int i) throws Exception{
		if(i>this.index-1) {
			throw new Exception("ArrayIndexOutOfBount");
		}else if(i<0) {
			throw new Exception("Negative Value");
		}
		for(int x = i;x<this.data.length-1;x++) {
			data[x] = data[x+1]; //한칸씩 앞으로 쉬프트하여 빈자리를 매꿔준다
		}
		this.index--;
	}
	public static void main(String[] args) throws Exception {
		ArrayList al=new ArrayList();
		al.add("0");
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		System.out.println(al.get(5));
		al.remove(5);
		System.out.println(al.get(5));
	}
}

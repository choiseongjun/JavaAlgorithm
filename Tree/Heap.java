package Tree;

public class Heap {

	private int[] data;
	private int size;
	private int maximumSize;

	public Heap() {
		data = new int[100];
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public Heap(int maximumSize) {
		if (maximumSize < 1) {
			this.maximumSize = 100;
		} else {
			this.maximumSize = maximumSize;
		}
		this.maximumSize = maximumSize;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == 100;
	}

	public void clear() {
		data = null;
	}
	
	//새로운 데이터 삽입
	public void insert(int newInt) {
		int pointer; // 어레이의 인덱스를 가리키는 포인터 이다.
		if(isFull()) {
			throw new FullHeapException();
		}
		
	}
}

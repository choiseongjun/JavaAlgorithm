package Stack;

public class ArrayStack {

	private int top;
	private int maxSize;
	private Object[] stackArray;
	
	// 배열 스택 생성,  스택의 최대 크기로 생성
	public ArrayStack(int maxSize) {
		this.maxSize=maxSize;
		this.stackArray=new Object[maxSize];
		this.top=-1;
	}
	public boolean Empty() {
		return(top==-1);
	}
	public boolean full() {
		return(top==maxSize-1);
	}
	public void Push(Object item) {
		if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">"+maxSize);
		
		stackArray[++top]=item;
	}
	public Object peek() {
		if(Empty()) throw new ArrayIndexOutOfBoundsException(top);
		return stackArray[top];
	}
	public Object pop() {
		Object item=peek();
		top--;
		return item;
	}
}

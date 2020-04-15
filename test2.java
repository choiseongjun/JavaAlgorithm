
public class test2 {

	private Object[] arr;
	private int maxSize;
	private int top;
	
	public test2(int maxSize) {
		this.maxSize=maxSize;
		this.top=-1;
		arr=new Object[maxSize];
	}
	public void add(Object item) {
		
		if(full()) System.out.println("full");
		
		arr[top++]=item;
		
	}
	public boolean full() {
		return (top==maxSize-1);
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public Object peek() {
		if(isEmpty()) System.out.println("empty");
		return arr[top];
	}
	public Object Pop() {
		
		Object item = peek();
		top--;
		return item;		
	}
}

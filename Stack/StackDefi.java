package Stack;

interface Stack{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	char pop();
	char peek();
	void clear();
}
public class StackDefi implements Stack{

	private int top;
	private int stackSize;
	private char stackArr[];
	
	
	
	public StackDefi(int stackSize) {
		this.top = -1;
		this.stackSize = stackSize;
		stackArr=new char[this.stackSize];
	}

	@Override
	public boolean isEmpty() {
		
		return (top==-1);
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}

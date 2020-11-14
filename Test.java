import java.util.Scanner;

interface Stack{
	boolean isEmpty();
	boolean isFull();
	char pop();
	void push(char item);
	char peek();
	void clear();
	
}

public class Test implements Stack{

	private int top;
	private int stackSize;
	private char stackArr[];
	
	public Test(int stackSize) {
		this.top=-1;
		this.stackSize=stackSize;
		stackArr=new char[this.stackSize];
	}
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top==-1);
	}

	

	@Override
	public char pop() {
		
		if(isEmpty()) {
			
		}else {
			System.out.println(stackArr[top]);
		}
		
		return stackArr[--top];
	}

	@Override
	public void push(char item) {
		if(isFull()) {
		}else {
			
			stackArr[++top]=item;
		}
	}

	@Override
	public char peek() {
		
		if(isEmpty()) {
			
		}else {
			System.out.println(stackArr[top]);
		}
		return stackArr[top];
	}

	@Override
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			top=-1;
			stackArr=new char[this.stackSize];
			System.out.println("stack is clear");
		}
		
	}
	public void printStack() {
		if(isEmpty()) {
			
		}else {
			for(int i=0;i<=top;i++) {
				System.out.print(stackArr[i]+" ");
			}
			System.out.println();
		}
	}

	@Override
	public boolean isFull() {
		return (top==this.stackSize-1);
	}
	public static void main(String[] args) {
		 	int stackSize = 5;
		 	Test arrStack = new Test(stackSize);
	        
	        arrStack.push('A');
	        arrStack.printStack();
	        
	        arrStack.push('B');
	        arrStack.printStack();

	}
}

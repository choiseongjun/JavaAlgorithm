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
		return (top==this.stackSize-1);
	}

	@Override
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			stackArr[++top]=item;
			System.out.println("inserted item"+item);
		}
	}
	@Override
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail stack memory");
			return 0;
		}else {
			  System.out.println("Deleted Item : " + stackArr[top]);
	            return stackArr[--top];
		}
	}

	@Override
	public char peek() {
		   if(isEmpty()) {
	            System.out.println("Peeking fail! Stack is empty!");
	            return 0;
	        } else { 
	            System.out.println("Peeked Item : " + stackArr[top]);
	            return stackArr[top];
	        }
	}

	@Override
	public void clear() {
		 if(isEmpty()) {
	            System.out.println("Stack is already empty!");
	        } else {
	            top = -1;    // 스택 포인터 초기화
	            stackArr = new char[this.stackSize];    // 새로운 스택 배열 생성
	            System.out.println("Stack is clear!");
	        }
	}
	 // 스택에 저장된 모든 데이터를 출력
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements : ");
            for(int i=0; i<=top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
 
    public static void main(String args[]) {
        int stackSize = 5;
        StackDefi arrStack = new StackDefi(stackSize);
        
        arrStack.push('A');
        arrStack.printStack();
        
        arrStack.push('B');
        arrStack.printStack();
        
        arrStack.push('C');
        arrStack.printStack();
        
        arrStack.pop();
        arrStack.printStack();
        
        arrStack.pop();
        arrStack.printStack();
        
        arrStack.peek();
        arrStack.printStack();
        
        arrStack.clear();
        arrStack.printStack();
    }


}

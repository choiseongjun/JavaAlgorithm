package List;

public class DoublyLinkedList {

	Node head;
	Node tail;
	private int size=0;
	
	class Node{
		Node next;
		Node prev;
		
		Object data;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public void addFirst(Object data) {
		Node newNode=new Node(data);
		newNode.next=head;
		
		if(head!=null) 
			head.prev = newNode;//헤드의 이전노드로 새로운 노드를 가르킨다.
		
		newNode=head;
		size++;
		if(head.next==null) {
			tail=head;
		}
	}
	public void addLast(Object data) {
		Node newNode=new Node(data);
		if(size==0) {
			addFirst(data);
		}else {
			tail.next=newNode;//꼬리 다음부분을 새 노드로 지정한다
			newNode.prev = tail;//새노드 이전은 꼬리이다.
			tail=newNode;//꼬리부분을 새노드로 갱신한다
			size++;
		}
	}
	public void add(int k,Object data) {
		if(k==0) {
			addFirst(data);
		}else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(data);
			temp1.next = newNode;
			newNode.next = temp2;
			
			if(temp2 != null) {
				temp2.prev = newNode;//temp2의 이전노드를 새노드로 지정한다 
			}
			newNode.prev = temp1;
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
		
	}
	Node node(int index) {
		
		if(index<size/2) {//반보다 작으면 head부터 출발한다 
			Node x = head;
			
			for(int i=0;i<index;i++)
				x=x.next;
			
			return x;	
		}else {
			Node x = tail;
			for(int i=size-1;i>index;i--) 
				x = x.prev;
			return x;
		}
	}
	public Object removeFirst() {
		Node temp =head;
		head = head.next;
		Object returnData = temp.data;
		temp=null;
		if(head != null) {
			head.prev = null;
		}
		size--;
		return returnData;
	}
	public Object remove(int k) {
		if(k==0) {
			return removeFirst();
		}else {
			Node temp = node(k-1);
			Node todoDeleted = temp.next;
			temp.next = temp.next.next;
			temp.next.prev = temp;//현재 temp next 의 이전 노드가 temp 자신을 가르키면 양방향이 된다 
			
			Object returnData = todoDeleted.data;
			if(todoDeleted == tail) {
				tail = temp;
			}
			todoDeleted = null;
			size--;
			return returnData;
		}
	}
	public Object removeLast() {
		return remove(size-1);
	}
	public Object get(int k) {
		Node temp=node(k);
		return temp.data;
	}
	public int indexOf(Object data) {
		
		Node temp = head;
		
		int index = 0;
		
		while(temp.data!=data) {
			temp = temp.next;
			index++;
			if(temp==null) {
				return -1;
			}
		}
		
		return index;
	}
	public int size() {
		return size;
	}
	
	public  ListIterator listIterator() {
		return new ListIterator();
	}
	public class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		public ListIterator() {
			next = head;
			nextIndex = 0;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		public Object previous() {
			if(next == null) {
				lastReturned = next = tail;
			}else {
				lastReturned = next = next.prev;
			}
			nextIndex--;
			return lastReturned.data;
		}
		public void add(Object data) {
			Node newNode = new Node(data);
		    if (lastReturned == null) {
		        head = newNode;
		        newNode.next = next;
		    } else {
		        lastReturned.next = newNode;
		        newNode.prev = lastReturned;
		        if (next != null) {
		            newNode.next = next;
		            next.prev = newNode;
		        } else {
		            tail = newNode;
		        }
		    }
		    lastReturned = newNode;
		    nextIndex++;
		    size++;
		}
		public void remove() {
			 if (nextIndex == 0) {
			        throw new IllegalStateException();
			    }
			    Node n = lastReturned.next;
			    Node p = lastReturned.prev;
			 
			    if (p == null) {
			        head = n;
			        head.prev = null;
			        lastReturned = null;
			    } else {
			        p.next = next;
			        lastReturned.prev = null;
			    }
			 
			    if (n == null) {
			        tail = p;
			        tail.next = null;
			    } else {
			        n.prev = p;
			    }
			 
			    if (next == null) {
			        lastReturned = tail;
			    } else {
			        lastReturned = next.prev;
			    }
			    size--;
			    nextIndex--;
		}
	}
}

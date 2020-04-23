package Tree;

public class Node {

	private Node left;
	private Node right;
	private Object data;
	
	public Node(Object data) {
		this.left=null;
		this.right=null;
		this.data=data;
	}
	
	public void makeLeftSubTree(Node sub) {
		if(this.left!=null) {
			this.left=null;
		}
		this.left=sub;
	}
	public void makeRightSubTree(Node sub) {
		if(this.right!=right) {
			this.right=null;
		}
		this.right=sub;
	}
	public Object getData() {
		return this.data;
	}
	public Object getLeftSubTree() {
		return this.left;
	}
	public Object getRightSubTree() {
		return this.right;
	}
}

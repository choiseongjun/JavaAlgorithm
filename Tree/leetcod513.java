package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class leetcod513 {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	 public static int findBottomLeftValue(TreeNode root) {
	        Queue queue = new LinkedList();
	        queue.offer(root);
	        TreeNode finNode = null;
	        while(!queue.isEmpty()) {
	            int len = queue.size();
	            for(int i = 0; i < len; i++) {
	                TreeNode node = (TreeNode) queue.poll();
	                if(node.right != null)
	                    queue.offer(node.right);
	                if(node.left != null)
	                    queue.offer(node.left);
	                if(queue.isEmpty())
	                    finNode = node;
	            }
	        }
	        return finNode == null ? -1 : finNode.val;
	    }
}

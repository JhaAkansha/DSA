/*
Given the root of a binary tree, return the boundary traversal of its nodes' values.
*/

public void preOrderTraversal (TreeNode n) {
		if (n == null) {
			return;
		}
		System.out.println(n.data);
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
	}
public void boundaryTraversal(TreeNode node) {
		left(node);
		right(node);
	}
	
	public void left(TreeNode node) {
		Queue<TreeNode> left = new LinkedList<>();
		while (node != null) {
			if (!isLeaf(node)) {
				left.add(node);
			}
			if (node.left != null) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		while (!left.isEmpty()) {
			System.out.println(left.remove());
		}
			preOrder(root);
	}
	
	public void right(TreeNode node) {
		Stack<TreeNode> right = new Stack<>();
		while (node != null) {
			if (!isLeaf(node) && node != root) {
				right.push(node);
			}
			if (node.right != null) {
				node = node.right;
			}
			else {
				node = node.left;
			}
		}
		while (!right.isEmpty()) {
			System.out.println(right.pop());
		}
	}
	
	public boolean isLeaf(TreeNode node) {
		if (node.left == null && node.right == null) return true;
		else return false;
	}
	
}

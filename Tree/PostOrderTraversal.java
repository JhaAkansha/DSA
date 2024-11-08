/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/

public void postOrderTraversal (TreeNode node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.data);
	}

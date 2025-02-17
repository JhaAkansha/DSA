/*
Find the height of a binary tree.
*/

public int height(TreeNode node) {
		if (node == null) return 0;
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		if (leftHeight>rightHeight) {
			return leftHeight+1;
		}
		else {
			return rightHeight+1;
		}
	}

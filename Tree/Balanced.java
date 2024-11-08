//Check whether a tree is balanced or not
	int checkHeight (TreeNode node) {
		if (node == null) return -1;
		int leftHeight = checkHeight(node.left);
		if(leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int rightHeight = checkHeight(node.right);
		if(rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(leftHeight, rightHeight) +1;
		}
	}
	public boolean isBalanced(TreeNode node) {
		return checkHeight(node) != Integer.MIN_VALUE;
	}

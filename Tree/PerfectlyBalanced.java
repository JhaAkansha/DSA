//Check whether a tree is perfectly balanced or not
	public boolean isPerfectlyBalanced(TreeNode node) {
		if (node == null) {
			return false;
		}
		if (node.left == null && node.right == null) return true;
		else if (node.left == null && node.right != null) return false;
		else if (node.right == null && node.left != null) return false;
		else return (isPerfectlyBalanced(node.left) && isPerfectlyBalanced(node.right));
	}

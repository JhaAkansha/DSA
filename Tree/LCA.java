/*
Given two nodes of a binary tree, find their least common ancestor.
*/

public boolean exists (TreeNode root, TreeNode p) {
		if (root == null) {
			return false;
		}
		if (p == root) {
			return true;
		}
		return exists(root.left, p) || exists(root.right, p);
	}
	
	public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || !exists(root, p) || !exists(root, q)) {
			return null;
		}
		if (p == root || q == root) {
			return root;
		}
		return Helper(root, p, q);
	}
	
	public TreeNode Helper(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode child = new TreeNode(root.data);
		boolean a = exists(root.left, p);
		boolean b = exists(root.left, q);
		if ( a != b) {
			return root;
		}
		if (a) {
			child = root.left;
		}
		else {
			child = root.right;
		}
		return Helper(child,p,q);
	}

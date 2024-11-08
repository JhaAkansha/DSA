/*
Given the root of a binary tree, return the level order traversal of its nodes' values.
*/

public void preOrderTraversal (TreeNode n) {
		if (n == null) {
			return;
		}
		System.out.println(n.data);
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
	}
		if (node == null) {
			return;
		}
		Queue<TreeNode> toVisit = new LinkedList<>();
		toVisit.add(node);
		while (!toVisit.isEmpty()) {
			TreeNode current = toVisit.remove();
			System.out.println(current);
			if (current.left != null) {
				toVisit.add(current.left);
			}
			if (current.right != null) {
				toVisit.add(current.right);
			}
		}
	}

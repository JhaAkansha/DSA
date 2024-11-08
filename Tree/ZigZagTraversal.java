/*
Given the root of a binary tree, return the zigzag traversal of its nodes' values.
*/

public void preOrderTraversal (TreeNode n) {
		if (n == null) {
			return;
		}
		System.out.println(n.data);
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
	}

public void zigZagOrder(TreeNode node) {
		List<TreeNode> res = new ArrayList<>();
		if (node == null) {
			return;
		}
		int index;
		Queue<TreeNode> toVisit = new LinkedList<>();
		toVisit.add(node);
		boolean leftToRight = true;
		while (!toVisit.isEmpty()) {
			int size = toVisit.size();
			TreeNode[] row = new TreeNode[size];
			Arrays.fill(row, 0);
			for (int i = 0; i<size; i++) {
				index = leftToRight?i:(size-1-i);
				node = toVisit.remove();
				row[index] =  node;
				if (node.left != null) {
					toVisit.add(node.left);
				}
				if (node.right != null) {
					toVisit.add(node.right);
				}
				for (int j = 0; j<row.length; j++) {
					res.add(row[j]);
				}
			}
			leftToRight = !leftToRight;
			for (int j = 0; j<res.size(); j++)
				System.out.println(res.get(j));
		}
	}

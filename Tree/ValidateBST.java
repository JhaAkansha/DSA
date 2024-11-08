/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

    1. The left subtree of a node contains only nodes with keys less than the node's key.
    2. The right subtree of a node contains only nodes with keys greater than the node's key.
    3. Both the left and right subtrees must also be binary search trees.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean fullArr(ArrayList<Integer> arr, int val)
    {
        if (arr.size() > 0)
        {
            if (arr.get(arr.size() - 1) < val)
                arr.add(val);
            else
                return  false;
        }
        else
            arr.add(val);
        return true;
    }

    public boolean checkArr(TreeNode root, ArrayList<Integer> arr) {
        boolean ok = true;

        if (ok && root.left != null)
        {
            if ((root.left.val < root.val))
                ok = checkArr(root.left, arr);
            else
                ok = false;
        }
        if (ok) ok = fullArr(arr, root.val);
        if (ok && root.right != null) {
            if (root.right.val > root.val)
                ok = checkArr(root.right, arr);
            else
                ok = false;
        }
        return ok;
    }

    public boolean isValidBST(TreeNode root) {
        return checkArr(root, new ArrayList<Integer>());
    }
}

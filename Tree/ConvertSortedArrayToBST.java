/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
*/

/*
  Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 */
class Solution {
    public TreeNode createBST(int arr[],int st,int end){
        int mid=(st+end)/2;
        if(st>end) return null;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        TreeNode root=createBST(nums,0,n-1);
        return root;
        
    }
}

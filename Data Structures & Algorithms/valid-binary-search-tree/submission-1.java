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
    List<Integer> ds= new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inOrder(root);

        for(int i=0;i<ds.size()-1;i++){
            if(ds.get(i)>=ds.get(i+1)){
                return false;
            }
        }
        return true;
        
    }
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        ds.add(root.val);
        inOrder(root.right);

    }
}

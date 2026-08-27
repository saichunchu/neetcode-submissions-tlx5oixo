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
    public List<Integer> rightSideView(TreeNode root) {
        rrl(root,0);
        return ds;
        
    }
    public void rrl(TreeNode node, int level){
      
        if(node==null){
            return ;
        }
        if(level==ds.size()){
            ds.add(node.val);
        }
        rrl(node.right,level+1);
        rrl(node.left,level+1);

    }
}

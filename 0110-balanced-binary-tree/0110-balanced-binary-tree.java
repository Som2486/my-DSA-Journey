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

    public boolean isBalanced(TreeNode root) {
        // Call the dfsHeight function to get the height of the tree
        // If the returned value is -1, the tree is not balanced
        // Otherwise, it is balanced
        return dfsHeight(root) != -1;
    }

    public static int dfsHeight(TreeNode root){

        // Base case: If the root is null, the height is 0
        if(root == null){
            return 0;
        }
    
        // Recursively get the height of the left subtree
        int leftHeight = dfsHeight(root.left);

        // If the left subtree is not balanced, return -1
        if(leftHeight == -1){
            return -1;
        }
    
        // Recursively get the height of the right subtree
        int rightHeight = dfsHeight(root.right);
        
        // If the right subtree is not balanced, return -1
        if(rightHeight == -1){
            return -1;
        }
    
        // If the absolute difference between the left and right subtree heights
        // is greater than 1, the tree is not balanced, so return -1
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
    
        // Otherwise, return the maximum height of the left and right subtrees, plus 1
        // This represents the height of the current node
    return Math.max(leftHeight,rightHeight)+1;
    }
}
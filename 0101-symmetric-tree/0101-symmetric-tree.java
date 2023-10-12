
class Solution {
    public boolean isSymmetric(TreeNode root)
    {    
        return isMirror(root.left, root.right);
    }
        public boolean isMirror(TreeNode T1, TreeNode T2)
        {   // BASE CASE
            if(T1 == null && T2 == null) return true;
            if(T1 == null || T2 == null) return false;
            // CHECK VALUES
            if(T1.val != T2.val) return false;
             //CHECK LEFT SUBTREE AND RIGHT SUBTREE
            return isMirror(T1.left,T2.right)
                   && isMirror(T1.right,T2.left);
        }
 }
        
   
    
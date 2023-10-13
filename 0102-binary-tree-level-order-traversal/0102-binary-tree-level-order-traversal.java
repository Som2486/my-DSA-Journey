class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            List<Integer> currentLevelValues = new LinkedList<>();
            Queue<TreeNode> nextLevel = new LinkedList<>();

            while (!currentLevel.isEmpty()) {
                TreeNode node = currentLevel.poll();
                currentLevelValues.add(node.val);

                if (node.left != null) {
                    nextLevel.add(node.left);
                }

                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }

            result.add(currentLevelValues);
            currentLevel = nextLevel;
        }

        return result;
    }
}
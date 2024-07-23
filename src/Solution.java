
public class Solution {
    public int maxDepth(TreeNode root) {
        
        recursive(root, max);
        if (root == null) {
            return 0;
        }
        return max + 1;
    }
    private int max;
    private void recursive(TreeNode node, int depth) {
        if (node == null) return;


        if (node.left == null && node.right == null) {
            max = Math.max(max, depth);
        }
        recursive(node.left, depth + 1);
        recursive(node.right, depth + 1);
    }
}
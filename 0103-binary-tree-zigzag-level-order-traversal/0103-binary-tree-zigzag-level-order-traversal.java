class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        boolean reverse = false;

        while (!q.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int level = q.size();

            for (int i = 0; i < level; i++) {
                if (!reverse) {
                    TreeNode curr = q.pollFirst();
                    if (curr.left != null) q.addLast(curr.left);
                    if (curr.right != null) q.addLast(curr.right);
                    current.add(curr.val);
                } else {
                    TreeNode curr = q.pollLast();
                    if (curr.right != null) q.addFirst(curr.right);
                    if (curr.left != null) q.addFirst(curr.left);
                    current.add(curr.val);
                }
            }

            res.add(current);
            reverse = !reverse;
        }

        return res;
    }
}
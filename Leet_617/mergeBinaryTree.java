package Leet_617;
import java.util.ArrayList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Util {
    void traverseInOrder(TreeNode node) {
        ArrayList tree = new ArrayList<TreeNode>();
        tree.add(node);
        while (!tree.isEmpty()) {
            TreeNode curr = (TreeNode) tree.remove(0);
            if (curr != null) {
                System.out.print(" " + curr.val);
                tree.add(curr.left);
                tree.add(curr.right);
            } else {
                System.out.print(" " + "null");
            }
        }

    }
}

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2== null){
            return null;
        }
        if(root1 == null){
            return root2;
        }

        if(root2 == null){
            return root1;
        }

        TreeNode root = new TreeNode(root1.val + root2.val);
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);

        return root;
    }
}

class MergeBinaryTree {

    public static void main(String args[]) {
        Util utl = new Util();

        int root1[] = { 1 };
        int root2[] = { 1,2 };

        TreeNode rt1[] = new TreeNode[root1.length];
        TreeNode rt2[] = new TreeNode[root2.length];

        for (int i = 0; i < root1.length; i++) {
            rt1[i] = new TreeNode(root1[i]);
        }

        for (int i = 0; i < root2.length; i++) {
            rt2[i] = new TreeNode(root2[i]);
        }

        TreeNode tree1 = rt1[0];
        TreeNode tree2 = rt2[0];

        for (int i = 0; i < rt1.length; i++) {
            if (i * 2 + 1 < rt1.length && rt1[i * 2 + 1].val != 0) {
                rt1[i].left = rt1[i * 2 + 1];
            }
            if (i * 2 + 2 < rt1.length && rt1[i * 2 + 2].val != 0) {
                rt1[i].right = rt1[i * 2 + 2];
            }
        }

        for (int i = 0; i < rt2.length; i++) {
            if (i * 2 + 1 < rt2.length && rt2[i * 2 + 1].val != 0) {
                rt2[i].left = rt2[i * 2 + 1];
            }
            if (i * 2 + 2 < rt2.length && rt2[i * 2 + 2].val != 0) {
                rt2[i].right = rt2[i * 2 + 2];
            }
        }

        Solution s = new Solution();
        TreeNode tn = s.mergeTrees(tree1, tree2);

        utl.traverseInOrder(tn);

    }
}
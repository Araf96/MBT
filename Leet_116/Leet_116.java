package Leet_116;
import java.util.ArrayList;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {

        if(root == null){
            return null;
        }

        if(root.left!=null){
            root.left.next = root.right == null ? null : root.right;
        }
        if(root.next!=null && root.right!=null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);

        return root;
    }
}

class Util {
    public void traverseInOrder(Node node) {
        ArrayList tree = new ArrayList<Node>();
        tree.add(node);
        while (!tree.isEmpty()) {
            Node curr = (Node) tree.remove(0);
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

class PopulateNextPointer {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Node head[] = new Node[arr.length];

        Util utl = new Util();
        Solution sol = new Solution();

        for (int i = 0; i < arr.length; i++) {
            head[i] = new Node(arr[i]);
        }

        Node top = head[0];

        for (int i = 0; i < head.length; i++) {
            if (i * 2 + 1 < head.length && head[i * 2 + 1].val != 0) {
                head[i].left = head[i * 2 + 1];
            }
            if (i * 2 + 2 < head.length && head[i * 2 + 2].val != 0) {
                head[i].right = head[i * 2 + 2];
            }
        }
        System.out.println("Entering");
        Node res = sol.connect(top);
        utl.traverseInOrder(res);

    }
}
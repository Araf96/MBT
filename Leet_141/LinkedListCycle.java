package Leet_141;

import java.util.HashMap;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    public ListNode curr;

    ListNode(int x) {
        val = x;
        next = null;
    }

    void add(int val){
        ListNode temp = new ListNode(val);
        curr.next = temp;
        curr = temp;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        HashSet<ListNode> set = new HashSet<>();
        while(curr!=null){
            if(set.add(curr)){
                curr = curr.next;
            }else{
                return true;
            }
        }
        return false;
    }
}

public class LinkedListCycle {
    public static void main(String args[]) {
        int arr[] = { 3, 2, 0, -4 };
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        // curr.add(arr[0]);
        // curr.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            ListNode ln = new ListNode(arr[i]);
            curr.next = ln;
            curr = ln;
        }
        Solution sol = new Solution();
        boolean res = sol.hasCycle(head);
        System.out.println(res);
    }
}

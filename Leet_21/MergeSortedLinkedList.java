package Leet_21;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode prev = new ListNode();
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        while (list1 != null && list2 != null) {
            ListNode curr = new ListNode();
            if (list1.val < list2.val) {
                curr = list1;
                list1 = list1.next;
            } else {
                curr = list2;
                list2 = list2.next;
            }
            if (res == null) {
                res = curr;
            } else {
                prev.next = curr;
            }
            prev = curr;
        }
        if (list1 != null) {
            prev.next = list1;
        }
        if (list2 != null) {
            prev.next = list2;
        }
        return res;
    }
}

public class MergeSortedLinkedList {
    public static void main(String args[]) {
        int arr1[] = {};
        int arr2[] = {};

        ListNode list1 = new ListNode(arr1[0]);
        ListNode list2 = new ListNode(arr2[0]);
        ListNode prev1 = list1;
        ListNode prev2 = list2;
        for (int i = 1; i < arr1.length; i++) {
            ListNode node = new ListNode(arr1[i]);
            prev1.next = node;
            prev1 = node;
        }
        for (int i = 1; i < arr2.length; i++) {
            ListNode node = new ListNode(arr2[i]);
            prev2.next = node;
            prev2 = node;
        }
        Solution sol = new Solution();
        ListNode l = new ListNode(0);
        ListNode res = sol.mergeTwoLists(null, l);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

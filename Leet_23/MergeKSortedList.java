package Leet_23;

import javax.rmi.CORBA.Util;

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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        ListNode curr = res;
        //ListNode prev = res;
        int nullCount;
        while (true) {
            ListNode min = new ListNode(Integer.MAX_VALUE);
            nullCount = 0;
            int idx = 0;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i]!=null){
                    if(lists[i].val < min.val){
                        min = lists[i];
                        idx = i;
                    }
                }else{
                    nullCount++;
                }
            }
            if(nullCount == lists.length){
                break;
            }
            lists[idx] = lists[idx].next;
            if(res == null){
                res = min;
                curr = res;
            }else{
                curr.next = min;
                curr = min;
            }
        }
        return res;
    }
}

class Utils {
    ListNode listConvert(int[] arr) {
        ListNode head = null;
        ListNode prev = null;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                head = new ListNode(arr[i]);
                prev = head;
            } else {
                ListNode curr = new ListNode(arr[i]);
                prev.next = curr;
                prev = curr;
            }
        }
        return head;
    }
}

public class MergeKSortedList {

    public static void main(String args[]) {
        int arr1[] = {  };
        int arr2[] = { 1, 3, 4 };
        int arr3[] = { 2, 6 };

        Utils utl = new Utils();
        ListNode l1 = utl.listConvert(arr1);
        ListNode l2 = utl.listConvert(arr2);
        ListNode l3 = utl.listConvert(arr3);

        ListNode lists[] = { l1, l2, l3 };

        Solution s = new Solution();
        ListNode res = s.mergeKLists(lists);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

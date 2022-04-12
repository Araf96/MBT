package Leet_23;

import java.util.Comparator;
import java.util.PriorityQueue;

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
        if(lists==null || lists.length==0)return null;
        ListNode res = null;
        ListNode curr = null;
        ListNode prev = null;

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b){
                if(a.val < b.val)return -1;
                else return 1;
            }
        });
        for(ListNode list : lists){
            if(list!=null){
                pq.add(list);
            }
            
        }

        while(!pq.isEmpty()){
            curr = pq.poll();
            if(curr.next!=null){
                pq.add(curr.next);
            }
            if(res == null){
                res = curr;
                prev = res;
            }else{
                prev.next = curr;
                prev = curr;
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
        int arr1[] = { 1, 2,5 };
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

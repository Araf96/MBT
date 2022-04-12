package Leet_mock_test;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        node =  node.next;
    }
}

public class DeleteNode {
    public static void main(String args[]) {
        int arr[] = { 4, 5, 1, 9 };
        int val = 5;
        ListNode head = new ListNode(4);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode ln = new ListNode(arr[i]);
            curr.next = ln;
            curr = ln;
        }
        Solution sol = new Solution();
        ListNode temp = head;
        while(temp!=null){
            if(temp.val==val){
                sol.deleteNode(temp);
                break;
            }
        }

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        
    }
}

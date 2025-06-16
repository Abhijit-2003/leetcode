/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;


        // brute force 

        // int count = 0;
        // ListNode temp = head;

        // while(temp != null) {
        //     count++;
        //     temp = temp.next;
        // }

        // count = count/2;
        // temp = head;
        // while(count > 0) {
        //     temp = temp.next;
        //     count--;
        // }

        // return temp;
    }
}
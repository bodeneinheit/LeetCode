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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode current = head;

        // length = iterate through list until the next node is null
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // if nodes > k continue
        if (count == k) {
            // reverse group of k nodes in head
            ListNode reversedHead = reverseLinkedList(head, k);

            // reverse next group of k nodes
            head.next = reverseKGroup(current, k);

            return reversedHead;
        }
        return head;
    }

    private ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        // reverse k nodes
        for (int i = 0; i < k; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

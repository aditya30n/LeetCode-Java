/*
Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //Iterative
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
            
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        head.next = null;
        
        while(temp2 != null){
             temp1 = temp2;
             temp2 = temp2.next;
             temp1.next = head;
             head = temp1;
        }
        
        return head;
    }
}

//Recursive
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
}

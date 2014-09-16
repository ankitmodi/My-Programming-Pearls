/*Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass.

*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode a = dummy, b = dummy;
        for(int i=0; i<n; i++)
        {
            b = b.next;
        }
        
        while(b.next!=null)
        {
            b=b.next;
            a=a.next;
        }
        if(a.next!=null)
        {
            a.next = a.next.next;
        }
        
        return dummy.next;
    }
}

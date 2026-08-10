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

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null){
            int val=findGCD(prev.val,temp.val);
            ListNode newnode=new ListNode(val);
            newnode.next=temp;
            prev.next=newnode;
            temp=temp.next;
            prev=prev.next.next;
        }
        return head;
        
    }
}
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] res=new int[size];
        int i=0;
        while(head!=null){
            ListNode l=head;
            while(l!=null){
                if(head.val<l.val){
                    break;
                }
                l=l.next;
            }
            res[i]=(l!=null)?l.val:0;
            i++;
            head=head.next;
        }
        return res;
    }
}
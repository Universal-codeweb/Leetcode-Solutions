/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode move1=head;
        ListNode move2=head;
        while(move2!=null&&move2.next!=null){
            move1=move1.next;
            move2=move2.next.next;
            if(move1==move2){
                return true;
            }
        }
        return false;
    }
}
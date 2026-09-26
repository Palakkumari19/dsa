public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast= head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sec = slow.next;
        ListNode prev = slow.next = null;
        while(sec!=null){
            ListNode temp = sec.next;
            sec.next = prev;
            prev = sec;
            sec = temp;
        }
        ListNode first = head;
        sec = prev;
        while(sec !=null){
            ListNode t1 = first.next;
            ListNode t2 = sec.next;
            first.next = sec;
            sec.next = t1;
            first = t1;
            sec = t2; 
        }
    }
}
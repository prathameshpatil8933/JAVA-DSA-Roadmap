
Brute Force : 
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
        HashSet<ListNode>visited=new HashSet<>();
        while(head!=null){
            if(visited.contains(head)) return true;
            visited.add(head);
            head=head.next;
        }
        return false;
      Time/Space: O(n) O(n) 

Optimized Aprroach : 
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
          if(head==null) return false;

     ListNode fast=head.next;
     ListNode slow=head;
     while(fast!=null && fast.next!=null){
        if(fast==slow) return true;
        slow=slow.next;
        fast=fast.next.next;
     }
     return false ;
        
    }
}
   Time/Space: O(n) O(1)

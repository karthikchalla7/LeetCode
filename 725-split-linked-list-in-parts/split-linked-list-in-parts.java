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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode current = head;
        while(current!=null){
            len++;
            current = current.next;
        }

        current = head;
        int basesize = len/k;
        int extra = len%k;

        ListNode[] res = new ListNode[k];

        for(int i=0;i<k;i++){
            ListNode parthead = current;
            int partsize = basesize+(extra>0?1:0);
            for(int j=0;j<partsize-1;j++){
                if(current!=null){
                    current = current.next;
                }
            }

            if(current!=null){
                ListNode nextnode = current.next;
                current.next = null;
                current = nextnode;
            }
            res[i]=parthead;
            if(extra>0) extra--;
        }
        return res;
    }
}
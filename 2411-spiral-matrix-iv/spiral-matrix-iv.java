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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][];
        for(int i=0;i<m;i++){
            matrix[i]=new int[n];
            Arrays.fill(matrix[i],-1);
        }

        int rowb = 0;
        int rowe = m-1;
        int colb = 0;
        int cole = n-1;
        
        while(head!=null){
            for(int col=colb;col<=cole && head!=null;col++){
                matrix[rowb][col] = head.val;
                head = head.next;
            }
            rowb++;

            for(int row = rowb;row<=rowe && head!=null;row++){
                matrix[row][cole] = head.val;
                head = head.next;
            }
            cole--;

            for(int col=cole;col>=colb && head!=null;col--){
                matrix[rowe][col]=head.val;
                head = head.next;
            }
            rowe--;


            for(int row = rowe;row>=rowb && head!=null;row--){
                matrix[row][colb]=head.val;
                head = head.next;
            }
            colb++;
        }
        return matrix;
    }
}
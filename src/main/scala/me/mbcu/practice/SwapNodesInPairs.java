package me.mbcu.practice;

public class SwapNodesInPairs {

    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static void main(String[] args) {

        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        swapPairs(l);

    }


    public static ListNode swapPairs(ListNode head) {
        ListNode a = null;
        int i = 0;
        ListNode res = head;
        while(head != null){
            if(i % 2 == 0) {
                a = head;
            }
            else {
                if (i == 1){
                    res = head;
                }
                a.next = head.next;
                head.next = a;
                head = a;
            }

            head = head.next;
            i++;
        }
        return res;
    }
}

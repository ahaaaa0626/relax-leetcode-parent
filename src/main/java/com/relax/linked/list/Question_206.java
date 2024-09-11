package com.relax.linked.list;

/**
 * @Author relax
 * @Date 2024/9/10 17:43
 * @Description 反转链表
 * @Version 1.0
 **/
public class Question_206 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    /**
     * recursion
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

    public static void loop(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        System.out.println("=================");
    }

    public static void main(String[] args) {
//        [1,2,3,4,5]
//        输出：[5,4,3,2,1]
        ListNode listNode0 = new ListNode(1, null);
        ListNode listNode1 = new ListNode(2, null);
        ListNode listNode2 = new ListNode(3, null);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        loop(listNode0);
        loop(reverseList(listNode0));

    }
}

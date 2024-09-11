package com.relax.linked.list;

/**
 * @Author relax
 * @Date 2024/9/10 17:43
 * @Description 一处
 * @Version 1.0
 **/
public class Question_203 {

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


    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }

    }

    public static void loop(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        System.out.println("=================");
    }

    public static void main(String[] args) {

        ListNode listNode0 = new ListNode(1, null);
        ListNode listNode1 = new ListNode(2, null);
        ListNode listNode2 = new ListNode(6, null);
//        ListNode listNode3 = new ListNode(3, null);
//        ListNode listNode4 = new ListNode(4, null);
//        ListNode listNode5 = new ListNode(5, null);
//        ListNode listNode6 = new ListNode(6, null);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
        loop(listNode0);
        loop(removeElements(listNode0, 6));


//        ListNode listNode0 = new ListNode(1, null);
//        loop(listNode0);
//        loop(removeElements(listNode0, 2));

    }
}

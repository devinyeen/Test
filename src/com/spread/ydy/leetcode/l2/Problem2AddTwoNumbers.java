package com.spread.ydy.leetcode.l2;

public class Problem2AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l = new Problem2AddTwoNumbers().addTwoNumbers(l1, l2);
        System.out.println(l);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = sumToInt(l1);
        int b = sumToInt(l2);
        int c = a + b;
        return intToNode(c);
    }

    public static int sumToInt(ListNode l) {
        int result = l.val;
        int i = 0;
        while(l.next != null) {
            i++;
            result += (l.next.val*Math.pow(10, i));
            l = l.next;
        }
        return result;
    }

    public static ListNode intToNode(int i) {
        System.out.println(i);
        i = i%10;
        ListNode l = new ListNode(i);
        ListNode lr = l.next;
        while(i >= 10) {
            i = i/10;
            lr = new ListNode(i%10);
            lr = lr.next;
        }
        return l;
    }
}

class ListNode {
    int      val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode [val=" + val + ", next=" + next + "]";
    }
}

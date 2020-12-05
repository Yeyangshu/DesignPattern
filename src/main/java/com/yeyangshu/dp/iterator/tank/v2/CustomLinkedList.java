package com.yeyangshu.dp.iterator.tank.v2;

/**
 * 自定义链表
 */
public class CustomLinkedList {

    Node head = null;
    Node tail = null;
    // 目前容器中有多少个元素
    private int size = 0;

    public void add(Object o) {
        Node n = new Node(o);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;
        size++;
    }

    private class Node {
        private Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }

    public int size() {
        return size;
    }
}

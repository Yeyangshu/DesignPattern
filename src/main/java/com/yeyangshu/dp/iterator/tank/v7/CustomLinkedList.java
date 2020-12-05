package com.yeyangshu.dp.iterator.tank.v7;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/12/5 22:48
 */
public class CustomLinkedList<E> implements CustomCollection<E> {
    Node head = null;
    Node tail = null;
    // 目前容器中有多少个元素
    private int size = 0;

    @Override
    public void add(E o) {
        Node n = new Node(o);
        n.next = null;

        if(head == null) {
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;
        size++;
    }

    private class Node {
        private E o;
        Node next;

        public Node(E o) {
            this.o = o;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public CustomIterator<E> iterator() {
        return null;
    }
}

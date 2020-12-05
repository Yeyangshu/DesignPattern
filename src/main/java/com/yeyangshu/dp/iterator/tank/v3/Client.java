package com.yeyangshu.dp.iterator.tank.v3;

public class Client {
    public static void main(String[] args) {
        CustomCollection linkedList = new CustomLinkedList();
        for (int i = 0; i < 15; i++) {
            linkedList.add("s" + i);
        }
        System.out.println(linkedList.size());
    }
}

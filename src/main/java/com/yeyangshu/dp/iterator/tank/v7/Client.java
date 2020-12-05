package com.yeyangshu.dp.iterator.tank.v7;

public class Client {
    public static void main(String[] args) {
        CustomCollection linkedList = new CustomLinkedList();
        for (int i = 0; i < 15; i++) {
            linkedList.add("s" + i);
        }
        System.out.println(linkedList.size());

        CustomLinkedList list = (CustomLinkedList) linkedList;
        for (int i = 0; i < list.size(); i++) {
            // 如果用这种遍历方式，就不能实现通用了
        }
    }
}

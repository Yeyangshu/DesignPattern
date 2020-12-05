package com.yeyangshu.dp.iterator.tank.v1;

public class Client {
    public static void main(String[] args) {
        CustomArrayList arrayList = new CustomArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add("s" + i);
        }
        System.out.println(arrayList.size());
    }
}

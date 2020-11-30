package com.yeyangshu.dp.builder.tank;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:45
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                .score(20)
                .weight(200)
                //.location("bj", "23")
                .build();
        System.out.println(person);
    }
}

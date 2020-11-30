package com.yeyangshu.dp.flyweight.tank;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/30 23:25
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        // true
        System.out.println(s1 == s2);
        // false
        System.out.println(s1 == s3);
        // false
        System.out.println(s3 == s4);
        // true
        System.out.println(s3.intern() == s1);
        // true
        System.out.println(s3.intern() == s4.intern());
    }
}

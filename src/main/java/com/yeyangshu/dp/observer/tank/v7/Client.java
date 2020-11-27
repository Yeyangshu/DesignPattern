package com.yeyangshu.dp.observer.tank.v7;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:56
 */
public class Client {

    public static void main(String[] args) {
        Child child = new Child();
        // child wake up, dad feed, mum hug, dog wangwang
        child.wakeUp();
        /**
         * Waked Up! Crying wuwuwuwu...
         * dad feeding...
         * mum hugging...
         * dog wang...
         */
    }

}
package com.yeyangshu.dp.observer.tank.v5;

/**
 * 分离观察者与被观察者
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
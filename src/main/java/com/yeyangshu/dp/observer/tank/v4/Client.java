package com.yeyangshu.dp.observer.tank.v4;

/**
 * 加入多个观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:56
 */
public class Client {

    public static void main(String[] args) {
        Child child = new Child();
        // child wake up, dad feed
        child.wakeUp();
        /**
         * Waked Up! Crying wuwuwuwu...
         * dad feeding...
         * mum hugging...
         * dog wang...
         */
    }
}

/**
 * 小孩对象，被观察者
 */
class Child {
    /** 小孩哭泣状态 */
    private boolean cry = false;

    /** 小孩爸爸，观察者 */
    private Dad dad = new Dad();
    /** 小孩妈妈，观察者 */
    private Mum mum = new Mum();
    /** 小狗，观察者 */
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwu...");
        cry = true;
        dad.feed();
        mum.hug();
        dog.wang();
    }
}

/**
 * 小孩爸爸，观察者
 */
class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

/**
 * 小孩妈妈，观察者
 */
class Mum {
    public void hug() {
        System.out.println("mum hugging...");
    }
}

/**
 * 小狗，观察者
 */
class Dog {
    public void wang() {
        System.out.println("dog wang...");
    }
}
package com.yeyangshu.dp.observer.tank.v3;

/**
 * 加入观察者
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

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwu...");
        cry = true;
        dad.feed();
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
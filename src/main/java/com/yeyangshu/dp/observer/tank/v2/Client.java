package com.yeyangshu.dp.observer.tank.v2;

/**
 * 面向对象的傻等
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:56
 */
public class Client {

    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing...");
        }
        /**
         * observing...
         * observing...
         * observing...
         * ...
         */
    }
}

/**
 * 小孩对象
 */
class Child {
    /**
     * 小孩哭泣状态
     */
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("Waked Up! Crying wuwuwuwu...");
        cry = true;
    }
}
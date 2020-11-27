package com.yeyangshu.dp.observer.book;

/**
 * 应用程序
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:46
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 创建一个观察者
        ConcreteObserver observer = new ConcreteObserver();
        // 添加观察者
        subject.attach(observer);
        // 状态改变，通知所有观察者
        subject.change();
    }

    /**
     * 收到通知，进行处理...
     */

}
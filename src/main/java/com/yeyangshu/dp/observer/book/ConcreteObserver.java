package com.yeyangshu.dp.observer.book;

/**
 * 具体的观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:44
 */
public class ConcreteObserver implements Observer {

    /**
     * 更新方法
     */
    @Override
    public void update() {
        System.out.println("收到通知，进行处理...");
    }

}

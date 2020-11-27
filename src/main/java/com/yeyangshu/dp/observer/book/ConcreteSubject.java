package com.yeyangshu.dp.observer.book;

import java.util.Vector;

/**
 * 具体主题
 * 发布事件
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:43
 */
public class ConcreteSubject implements Subject {

    /** 同步容器 */
    private Vector<Observer> observers = new Vector<Observer>();

    /**
     * 登记一个新的观察者
     *
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除一个登记过的观察者
     *
     * @param observer
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有登记过的观察者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * 改变状态
     */
    public void change() {
        this.notifyObservers();
    }

}

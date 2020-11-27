package com.yeyangshu.dp.observer.book;

/**
 * 被观察者接口
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 22:41
 */
public interface Subject {

    /**
     * 登记一个新的观察者
     *
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 删除一个登记过的观察者
     *
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知所有登记过的观察者
     */
    public void notifyObservers();

}

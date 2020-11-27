package com.yeyangshu.dp.observer.tank.v8;

/**
 * 时间抽象类
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:46
 */
public abstract class Event<T> {

    /**
     * 事件来源
     *
     * @return
     */
    abstract T getSource();
}

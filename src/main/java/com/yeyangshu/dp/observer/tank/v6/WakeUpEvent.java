package com.yeyangshu.dp.observer.tank.v6;

/**
 * 小孩醒来事件
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:31
 */
public class WakeUpEvent {

    /** 事件发生时间 */
    long timestamp;

    /** 事件发生位置 */
    String location;

    /**
     * 构造函数
     *
     * @param timestamp 事件发生时间
     * @param location 事件发生位置
     */
    public WakeUpEvent(long timestamp, String location) {
        this.timestamp = timestamp;
        this.location = location;
    }

}

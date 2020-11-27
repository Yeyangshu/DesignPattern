package com.yeyangshu.dp.observer.tank.v7;

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

    /** 事件来源 */
    private Child source;

    /**
     * 构造函数
     *
     * @param timestamp 事件发生时间
     * @param location 事件发生位置
     * @param source 事件来源
     */
    public WakeUpEvent(long timestamp, String location, Child source) {
        this.timestamp = timestamp;
        this.location = location;
        this.source = source;
    }

}

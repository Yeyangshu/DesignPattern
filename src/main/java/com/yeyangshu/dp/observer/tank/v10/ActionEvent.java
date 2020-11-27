package com.yeyangshu.dp.observer.tank.v10;

/**
 * 事件
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 0:32
 */
public class ActionEvent {

    /** 事件发生时间 */
    long time;

    /** 事件来源 */
    Object source;

    public ActionEvent(long time, Object source) {
        this.time = time;
        this.source = source;
    }

    public long getWhen() {
        return time;
    }

    public Object getSource() {
        return source;
    }
}

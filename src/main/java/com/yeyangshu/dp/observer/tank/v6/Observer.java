package com.yeyangshu.dp.observer.tank.v6;

/**
 * 观察者接口
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:10
 */
public interface Observer {

    /**
     * 对事件做出的动作
     *
     * @param event 事件
     */
    void actionOnWakeUp(WakeUpEvent event);

}

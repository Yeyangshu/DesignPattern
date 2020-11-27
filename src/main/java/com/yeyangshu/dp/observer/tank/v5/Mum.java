package com.yeyangshu.dp.observer.tank.v5;

/**
 * 小孩妈妈，观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:14
 */
public class Mum implements Observer {

    /**
     * 对事件做出的动作，妈妈抱抱
     */
    @Override
    public void actionOnWakeUp() {
        hug();
    }

    /**
     * 抱抱
     */
    public void hug() {
        System.out.println("mum hugging...");
    }

}

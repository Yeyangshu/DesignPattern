package com.yeyangshu.dp.observer.tank.v5;

/**
 * 小孩爸爸，观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:12
 */
public class Dad implements Observer {

    /**
     * 对事件做出的动作，爸爸喂食
     */
    @Override
    public void actionOnWakeUp() {
        feed();
    }

    /**
     * 喂食
     */
    public void feed() {
        System.out.println("dad feeding...");
    }

}

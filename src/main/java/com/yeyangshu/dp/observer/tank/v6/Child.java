package com.yeyangshu.dp.observer.tank.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 小孩，被观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:12
 */
public class Child {

    /** 小孩哭泣状态 */
    private boolean cry = false;

    /** 观察者列表 */
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        System.out.println("Waked Up! Crying wuwuwuwu...");
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed");
        for (Observer o : observers) {
            o.actionOnWakeUp(event);
        }
    }

}
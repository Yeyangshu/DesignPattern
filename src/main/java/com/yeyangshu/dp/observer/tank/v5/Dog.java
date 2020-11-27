package com.yeyangshu.dp.observer.tank.v5;

/**
 * 小狗，观察者
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/27 23:15
 */
public class Dog implements Observer {

    /**
     * 对事件做出的动作
     */
    @Override
    public void actionOnWakeUp() {
        wang();
    }

    /**
     * 汪汪
     */
    public void wang() {
        System.out.println("dog wang...");
    }

}

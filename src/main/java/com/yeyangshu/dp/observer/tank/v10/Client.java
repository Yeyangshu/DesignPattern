package com.yeyangshu.dp.observer.tank.v10;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 0:39
 */
public class Client {
    public static void main(String[] args) {
        // 被观察者
        Button b = new Button();

        // 添加观察者
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());

        // 被观察者执行动作
        b.buttonPressed();
    }

    /**
     * button pressed 1!
     * button pressed 2!
     */
}

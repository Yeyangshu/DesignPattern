package com.yeyangshu.dp.observer.tank.v10;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者Button
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 0:36
 */
public class Button {

    /** 观察者列表 */
    private List<ActionListener> actionListeners = new ArrayList<ActionListener>();

    /**
     * 动作
     */
    public void buttonPressed() {
        ActionEvent event = new ActionEvent(System.currentTimeMillis(), this);
        for (ActionListener actionListener : actionListeners) {
            actionListener.actionPerformed(event);
        }
    }

    /**
     * 添加观察者
     *
     * @param actionListener 观察者
     */
    public void addActionListener(ActionListener actionListener) {
        actionListeners.add(actionListener);
    }
}

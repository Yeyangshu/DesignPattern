package com.yeyangshu.dp.observer.tank.v10;

/**
 * 观察者1
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 0:35
 */
public class MyActionListener2 implements ActionListener {
    /**
     * 对事件做出的动作
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("button pressed 2!");
    }
}

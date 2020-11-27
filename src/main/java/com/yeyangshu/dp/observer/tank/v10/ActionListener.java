package com.yeyangshu.dp.observer.tank.v10;

/**
 * 观察者接口
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 0:34
 */
public interface ActionListener {

    /**
     * 对事件做出的动作
     *
     * @param event
     */
    public void actionPerformed(ActionEvent event);

}

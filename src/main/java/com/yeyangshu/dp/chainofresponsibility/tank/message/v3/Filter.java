package com.yeyangshu.dp.chainofresponsibility.tank.message.v3;

/**
 * 抽象出Filter接口
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:07
 */
public interface Filter {

    /**
     * 处理消息Filter
     *
     * @param message 用户发送的消息
     */
    void doFilter(Message message);
}

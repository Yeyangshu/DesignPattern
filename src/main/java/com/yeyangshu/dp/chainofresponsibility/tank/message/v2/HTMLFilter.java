package com.yeyangshu.dp.chainofresponsibility.tank.message.v2;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:08
 */
public class HTMLFilter implements Filter {
    /**
     * 处理消息中的 HTML
     *
     * @param message 用户发送的消息
     */
    @Override
    public void doFilter(Message message) {
        String r = message.getMessage();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        message.setMessage(r);
    }
}

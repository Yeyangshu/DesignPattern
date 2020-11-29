package com.yeyangshu.dp.chainofresponsibility.tank.message.v6;

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
    public boolean doFilter(Message message) {
        String r = message.getMessage();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        message.setMessage(r);
        return true;
    }
}

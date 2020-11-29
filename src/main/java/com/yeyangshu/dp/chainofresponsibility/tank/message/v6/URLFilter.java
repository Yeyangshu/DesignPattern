package com.yeyangshu.dp.chainofresponsibility.tank.message.v6;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:34
 */
public class URLFilter implements Filter {
    /**
     * 处理消息 URL
     *
     * @param message 用户发送的消息
     */
    @Override
    public boolean doFilter(Message message) {
        String r = message.getMessage();
        r = r.replace("mashibing.com", "http://www.mashibing.com");
        message.setMessage(r);
        return true;
    }
}

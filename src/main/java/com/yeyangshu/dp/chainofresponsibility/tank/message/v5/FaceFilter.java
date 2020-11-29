package com.yeyangshu.dp.chainofresponsibility.tank.message.v5;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:33
 */
public class FaceFilter implements Filter {
    /**
     * 处理消息笑脸
     *
     * @param message 用户发送的消息
     */
    @Override
    public void doFilter(Message message) {
        String r = message.getMessage();
        r = r.replace(":)", "^V^");
        message.setMessage(r);
    }
}

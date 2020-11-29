package com.yeyangshu.dp.chainofresponsibility.tank.message.v5;

/**
 * 消息
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 18:57
 */
public class Message {

    /** 用户姓名 */
    private String name;

    /** 用户发的消息 */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}

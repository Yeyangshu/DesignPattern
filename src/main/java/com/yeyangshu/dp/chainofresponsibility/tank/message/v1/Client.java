package com.yeyangshu.dp.chainofresponsibility.tank.message.v1;

/**
 * 最简单的处理消息
 * 缺点：所有代码写在一起，不易拓展
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 18:57
 */
public class Client {

    public static void main(String[] args) {
        Message message = new Message();
        message.setMessage("大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996。");

        // 对用户的消息进行处理
        // 1 替换敏感词
        String r = message.getMessage();
        r = r.replace('<', '[');
        r = r.replace('>', ']');
        message.setMessage(r);

        // 2 替换996为955
        r = r.replaceAll("996", "955");
        message.setMessage(r);

        System.out.println(message.toString());

    }
}

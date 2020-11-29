package com.yeyangshu.dp.chainofresponsibility.tank.message.v2;

/**
 * 抽象 Filter 接口，实际的处理实现 Filter 接口
 * 缺点：当新增 Filter 还需要新增代码
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
        // 1 处理 HTML
        new HTMLFilter().doFilter(message);
        // 2 处理敏感词
        new SensitiveFilter().doFilter(message);

        System.out.println(message.toString());
    }
}

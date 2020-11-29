package com.yeyangshu.dp.chainofresponsibility.tank.message.v5;

/**
 * FilterChain 实现 Filter，实现多个 Filter 互相添加
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
        // 链式编程
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        FilterChain filterChain2 = new FilterChain();
        filterChain.add(new FaceFilter()).add(new URLFilter());

        // 不同的 FilterChain 之间互相添加
        filterChain.add(filterChain2);

        // 处理Filter
        filterChain.doFilter(message);

        System.out.println(message.toString());
    }
}

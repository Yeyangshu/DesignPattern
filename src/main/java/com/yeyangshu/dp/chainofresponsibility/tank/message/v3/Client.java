package com.yeyangshu.dp.chainofresponsibility.tank.message.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 将所有的 Filter 串起来
 * 缺点：不是一个链条
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
        List<Filter> filters = new ArrayList<>();
        filters.add(new HTMLFilter());
        filters.add(new SensitiveFilter());

        // 处理Filter
        for (Filter filter : filters) {
            filter.doFilter(message);
        }

        System.out.println(message.toString());
    }
}

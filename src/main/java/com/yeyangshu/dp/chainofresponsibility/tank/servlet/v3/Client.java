package com.yeyangshu.dp.chainofresponsibility.tank.servlet.v3;

/**
 * 如何处理 response？
 * 在 filterChain 中处理加入位置的记录，同时在 filter 中加入第三个参数
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 18:57
 */
public class Client {

    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
        Response response = new Response();
        response.str = "response";
        // 对用户的消息进行处理
        // 链式编程
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitiveFilter());
        // 处理Filter
        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.str);
        System.out.println(response.str);

    }
}

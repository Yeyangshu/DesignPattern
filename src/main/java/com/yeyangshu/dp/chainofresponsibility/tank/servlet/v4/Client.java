package com.yeyangshu.dp.chainofresponsibility.tank.servlet.v4;

/**
 * 完全模式 Servlet 中的 FilterChain
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
        filterChain.doFilter(request, response);

        System.out.println(request.str);
        System.out.println(response.str);

    }
}

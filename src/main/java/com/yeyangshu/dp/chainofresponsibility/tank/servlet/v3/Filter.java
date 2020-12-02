package com.yeyangshu.dp.chainofresponsibility.tank.servlet.v3;

/**
 * 抽象出Filter接口
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:07
 */
public interface Filter {

    /**
     * 处理消息
     *
     * @param request
     * @param response
     * @return
     */
    boolean doFilter(Request request, Response response , FilterChain chain);
}

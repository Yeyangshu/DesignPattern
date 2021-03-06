package com.yeyangshu.dp.chainofresponsibility.tank.servlet.v4;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:08
 */
public class HTMLFilter implements Filter {
    /**
     * 处理消息中的 HTML
     *
     * @param request
     * @param response
     * @return
     */
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]");
        chain.doFilter(request, response);
        response.str += "--HTMLFilter()";
        return true;
    }
}

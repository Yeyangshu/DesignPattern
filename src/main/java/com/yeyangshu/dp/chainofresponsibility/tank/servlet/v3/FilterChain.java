package com.yeyangshu.dp.chainofresponsibility.tank.servlet.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain 实现 Filter，实现多个 Filter 互相添加
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:19
 */
public class FilterChain implements Filter {

    /** filter list */
    private List<Filter> filters = new ArrayList<>();

    /** 位置标识 */
    int index = 0;

    /**
     * 处理消息
     *
     * @param request
     * @param response
     * @return
     */
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return false;
        }
        Filter f = filters.get(index);
        index++;

        return f.doFilter(request, response, chain);
    }

    /**
     * 添加 Filter
     *
     * @param filter
     * @return
     */
    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    /**
     * 删除 Filter
     * @param filter
     */
    public FilterChain delete(Filter filter) {
        filters.remove(filter);
        return this;
    }

}

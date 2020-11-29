package com.yeyangshu.dp.chainofresponsibility.tank.message.v6;

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

    /**
     * 处理消息
     *
     * @param message
     */
    @Override
    public boolean doFilter(Message message) {
        for (Filter filter : filters) {
            if (!filter.doFilter(message)) {
                return false;
            }
        }
        return true;
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

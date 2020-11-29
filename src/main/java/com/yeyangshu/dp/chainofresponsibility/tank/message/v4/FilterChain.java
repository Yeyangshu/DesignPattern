package com.yeyangshu.dp.chainofresponsibility.tank.message.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * add/delete 方法返回 FilterChain 类型，链式编程
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/29 19:19
 */
public class FilterChain {

    /** filter list */
    private List<Filter> filters = new ArrayList<>();

    /**
     * 处理消息
     *
     * @param message
     */
    public void doFilter(Message message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
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

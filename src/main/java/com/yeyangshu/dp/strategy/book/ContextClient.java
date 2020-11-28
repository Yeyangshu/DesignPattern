package com.yeyangshu.dp.strategy.book;

/**
 * 环境角色
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:33
 */
public class ContextClient {

    /** 抽象策略模式 */
    private DiscountStrategy discountStrategy;

    /**
     * 调用策略模式，计算折扣总额
     *
     * @return
     */
    public double calDiscount() {
        return discountStrategy.calculateDisCount();
    }

    /**
     * 构造函数
     *
     * @param discountStrategy
     */
    public ContextClient(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}

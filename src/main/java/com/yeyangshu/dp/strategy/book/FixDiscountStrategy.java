package com.yeyangshu.dp.strategy.book;

/**
 * 固定折扣的算法：每本折扣 1 元
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:26
 */
public class FixDiscountStrategy extends DiscountStrategy {

    /**
     * 固定折扣的算法
     *
     * @return 价格
     */
    @Override
    public double calculateDisCount() {
        return getNumber();
    }

    /**
     * 构造方法
     *
     * @param price
     * @param number
     */
    public FixDiscountStrategy(double price, int number) {
        super(price, number);
    }
}

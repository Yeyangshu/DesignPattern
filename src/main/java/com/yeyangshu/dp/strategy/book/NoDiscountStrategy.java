package com.yeyangshu.dp.strategy.book;

/**
 * 没有折扣的算法：不折扣
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:24
 */
public class NoDiscountStrategy extends DiscountStrategy {

    /**
     * 没有折扣的算法
     *
     * @return 价格
     */
    @Override
    public double calculateDisCount() {
        return 0;
    }

    /**
     * 构造函数
     *
     * @param price
     * @param number
     */
    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }
}

package com.yeyangshu.dp.strategy.book;

/**
 * 百分比折扣
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:31
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    /**
     * 百分比折扣
     *
     * @return 价格
     */
    @Override
    public double calculateDisCount() {
        return getNumber() * getPrice() * 0.15;
    }

    /**
     * 构造方法
     *
     * @param price
     * @param number
     */
    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }
}

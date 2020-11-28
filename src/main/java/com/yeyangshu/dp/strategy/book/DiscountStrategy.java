package com.yeyangshu.dp.strategy.book;

/**
 * 策略模式
 * 抽象的折扣算法
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:17
 */
public abstract class DiscountStrategy {

    /** 书的价格 */
    private double price = 0;

    /** 书的数量 */
    private int number = 0;

    /**
     * 策略方法
     * 计算折扣额
     *
     * @return 价格
     */
    public abstract double calculateDisCount();

    /**
     * 构造函数
     *
     * @param price  价格
     * @param number 数量
     */
    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

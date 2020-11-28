package com.yeyangshu.dp.strategy.book;

/**
 * 客户端调用测试
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 11:39
 */
public class Client {

    public static void main(String[] args) {
        // 使用 0 折扣方法，计算折扣总额
        ContextClient contextClient0 = new ContextClient(new NoDiscountStrategy(50, 50));
        System.out.println("0折扣总额:" + contextClient0.calDiscount());

        // 使用固定折扣方法，计算折扣总额
        ContextClient contextClientFix = new ContextClient(new FixDiscountStrategy(50, 50));
        System.out.println("固定折扣总额:" + contextClientFix.calDiscount());

        // 使用15%折扣方法，计算折扣总额
        ContextClient contextClientPercent = new ContextClient(new PercentageDiscountStrategy(50, 50));
        System.out.println("15%折扣总额:" + contextClientPercent.calDiscount());
    }

    /**
     * 0折扣总额:0.0
     * 固定折扣总额:50.0
     * 15%折扣总额:375.0
     */
}

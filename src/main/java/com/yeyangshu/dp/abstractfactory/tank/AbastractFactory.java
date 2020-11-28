package com.yeyangshu.dp.abstractfactory.tank;

/**
 * 抽象工厂
 * 定义产品一族
 */
public abstract class AbastractFactory {

    /**
     * 生产食品
     *
     * @return 食品类
     */
    abstract Food createFood();

    /**
     * 生产交通工具
     *
     * @return 交通工具类
     */
    abstract Vehicle createVehicle();

    /**
     * 生产武器
     *
     * @return 武器类
     */
    abstract Weapon createWeapon();
}

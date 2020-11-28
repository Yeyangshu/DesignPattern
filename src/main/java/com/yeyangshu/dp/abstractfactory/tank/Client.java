package com.yeyangshu.dp.abstractfactory.tank;

/**
 * 抽象工厂
 * 如果想生产魔法人产品，只需要替换为 new MagicFactory();
 */
public class Client {
    public static void main(String[] args) {
        // 现代人工厂生产一系列现代产品
        AbastractFactory f = new ModernFactory();
        // 魔法人工厂生产一系列魔法产品
        // AbastractFactory f = new MagicFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }

    /**
     * Car go wuwuwuwuw....
     * tututututu....
     * wdm
     */
}

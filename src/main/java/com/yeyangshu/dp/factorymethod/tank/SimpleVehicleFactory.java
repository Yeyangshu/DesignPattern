package com.yeyangshu.dp.factorymethod.tank;

/**
 * 简单工厂
 * 可扩展性不好
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 21:45
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }

    public Plane createPlane() {
        return new Plane();
    }
}

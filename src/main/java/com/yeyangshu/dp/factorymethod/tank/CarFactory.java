package com.yeyangshu.dp.factorymethod.tank;

import javafx.scene.shape.Circle;

/**
 * 工厂模式
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 21:48
 */
public class CarFactory {
    public Moveable create(String type) {
        if ("CAR".equalsIgnoreCase(type)) {
            System.out.println("a car created!");
            return new Car();
        } else if ("PLANE".equalsIgnoreCase(type)) {
            System.out.println("a plane created!");
            return new Plane();
        } else if ("BROOM".equalsIgnoreCase(type)) {
            System.out.println("a broom created!");
            return new Broom();
        }
        return null;
    }
}

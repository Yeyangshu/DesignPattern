package com.yeyangshu.dp.factorymethod.tank;

/**
 * 工厂模式关键代码：创建过程在其子类执行。
 *
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 21:46
 */
public class Client {

    public static void main(String[] args) {
        // 使用简单工厂生产工具
        System.out.println("-----简单工厂-----");
        SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
        // 使用简单工厂生产汽车
        Car car = simpleVehicleFactory.createCar();
        car.go();
        // 使用简单工厂生产飞机
        Plane plane = simpleVehicleFactory.createPlane();
        plane.go();

        // 使用工厂方法生产汽车
        System.out.println("-----工厂方法-----");
        Moveable car1 = new CarFactory().create("car");
        car1.go();
        Moveable plane2 = new CarFactory().create("plane");
        plane2.go();
    }

    /**
     * -----简单工厂-----
     * Car go wuwuwuwuw....
     * plane flying shushua....
     *
     * -----工厂方法-----
     * a car created!
     * Car go wuwuwuwuw....
     * a plane created!
     * plane flying shushua....
     */
}

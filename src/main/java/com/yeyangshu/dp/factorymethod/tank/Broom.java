package com.yeyangshu.dp.factorymethod.tank;

/**
 * @author yeyangshu
 * @version 1.0
 * @date 2020/11/28 21:44
 */
public class Broom implements Moveable {
    @Override
    public void go() {
        System.out.println("broom flying chuachuachua .....");
    }
}

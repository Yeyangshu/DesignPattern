package com.yeyangshu.dp.abstractfactory.tank;

/**
 * 魔法人系列工厂
 */
public class MagicFactory extends AbastractFactory {

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}

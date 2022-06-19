package com.hc.abstractfactory;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 21:27
 * @Description: com.hc.abstractfactory
 * @Version: 1.0
 **/
public class MagicFactory extends Abstractfactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Boom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}

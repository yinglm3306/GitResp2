package com.hc.abstractfactory;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 21:25
 * @Description: com.hc.abstractfactory
 * @Version: 1.0
 **/
public class ModernFactory extends Abstractfactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}

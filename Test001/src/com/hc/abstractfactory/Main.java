package com.hc.abstractfactory;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 21:29
 * @Description: com.hc.abstractfactory
 * @Version: 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Abstractfactory f= new ModernFactory();
        Vehicle c= f.createVehicle();
        c.go();
        Weapon w= f.createWeapon();
        w.shoot();
        Food food = f.createFood();
        food.printName();
    }
}

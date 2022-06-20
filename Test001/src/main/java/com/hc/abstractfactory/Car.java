package com.hc.abstractfactory;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 21:20
 * @Description: com.hc.abstractfactory
 * @Version: 1.0
 **/
public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Car is running...");
    }
}

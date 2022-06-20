package com.hc.abstractfactory;

public class Car extends Vehicle {
    @Override
    void go() {
        System.out.println("Car running");
    }
}

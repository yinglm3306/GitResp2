package com.hc.abstractfactory;

public class TestMain {
    public static void main(String[] args) {
        Abstractfactory f= new MagicFactory();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Food food = f.createFood();
        food.printName();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
    }
}

package com.hc.abstractfactory;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 21:22
 * @Description: com.hc.abstractfactory
 * @Version: 1.0
 **/
public class MagicStick extends Weapon {
    @Override
    void shoot() {
        System.out.println("MagicStick is shooting");
    }
}

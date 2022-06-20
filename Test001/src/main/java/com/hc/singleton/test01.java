package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 19:25
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class test01 {
    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.GetInstance();
        Mgr01 m2 = Mgr01.GetInstance();
        System.out.println(m1 == m2);
    }
}

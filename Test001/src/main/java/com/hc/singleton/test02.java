package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 20:44
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class test02 {
    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);
    }
}

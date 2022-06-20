package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/16 0016 - 06 - 16 - 20:13
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Test08 {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(() ->

                 {
                    System.out.println(Mgr08.INSTANCE.hashCode());
                }
            ).start();
        }
    }
}

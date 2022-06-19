package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 20:53
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class test03 {
    public static void main(String[] args) {
        for (int i=0 ;i<100; i++){
            new Thread(() ->

                {
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            ).start();
        }
    }
}

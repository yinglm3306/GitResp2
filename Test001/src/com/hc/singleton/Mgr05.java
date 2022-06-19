package com.hc.singleton;

import sun.security.jca.GetInstance;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 16:24
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){}
    public static Mgr05 GetInstance (){
        if(INSTANCE==null){
            synchronized (Mgr05.class) {
                if(INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr05();
                }
            }
        }
        return INSTANCE;
    }

    public void g(){
        System.out.println("g");
    }


}

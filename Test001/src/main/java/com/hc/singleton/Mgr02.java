package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 20:32
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }


    private Mgr02(){

    }

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public void f(){
        System.out.println("f");
    }






}

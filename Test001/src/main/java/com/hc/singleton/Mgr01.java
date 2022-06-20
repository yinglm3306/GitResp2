package com.hc.singleton;

import sun.security.jca.GetInstance;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 19:21
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr01 {
    private static final Mgr01 INSTANCE= new Mgr01();

    private  Mgr01(){

    }

    public  static Mgr01 GetInstance(){
        return INSTANCE;
    }

    public  void f(){
        System.out.println("f");
    }




}

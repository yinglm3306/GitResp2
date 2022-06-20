package com.hc.singleton;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Auther: yingliming
 * @Date: 2022/6/15 0015 - 06 - 15 - 21:23
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr07 {
    private Mgr07 (){}

    private static class Mgr07Holder{
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance(){

        return  Mgr07Holder.INSTANCE;


    }

    public void f(){
        System.out.println("f");
    }





}

package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 16:07
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr04 {
    private static  Mgr04 INSTANCE;
    private Mgr04(){};
    public static synchronized Mgr04 getInstance(){

        if(INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE= new Mgr04();
        }
        return INSTANCE;
    }

    public void f(){
        System.out.println("f");
    }
}

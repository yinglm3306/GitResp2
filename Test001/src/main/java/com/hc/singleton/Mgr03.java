package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/14 0014 - 06 - 14 - 20:48
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){}

    public static Mgr03 getInstance(){
        if(INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void g(){
        System.out.println("g");
    }


}

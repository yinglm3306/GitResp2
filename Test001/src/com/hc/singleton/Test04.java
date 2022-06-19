package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/19 0019 - 06 - 19 - 16:14
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Test04 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr04.getInstance().hashCode());
                }
            }).start();
        }
    }
}

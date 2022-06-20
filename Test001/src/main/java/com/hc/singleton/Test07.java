package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/15 0015 - 06 - 15 - 22:14
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Test07 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){

            new Thread(()-> {
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }

    }
}

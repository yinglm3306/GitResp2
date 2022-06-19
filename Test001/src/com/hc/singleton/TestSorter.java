package com.hc.singleton;

import java.util.Arrays;

/**
 * @Auther: yingliming
 * @Date: 2022/6/17 0017 - 06 - 17 - 19:37
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class TestSorter {
    public static void main(String[] args) {
        int[] a = {9,2,3,5,7,1,8};
        Sorter sorter= new Sorter();
        sorter.sort(a);

        System.out.println(Arrays.toString(a));
    }
}

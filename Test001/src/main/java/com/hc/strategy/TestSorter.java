package com.hc.strategy;

import java.util.Arrays;

/**
 * @Auther: yingliming
 * @Date: 2022/6/17 0017 - 06 - 17 - 19:37
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class TestSorter {
    public static void main(String[] args) {
        Cat[] a = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};

        //Dog[] a = {new Dog(3),new Dog(5),new Dog(1)};
        Sorter<Cat> sorter= new Sorter<>();
        sorter.sort(a, new CatHeightMyComparable());

        System.out.println(Arrays.toString(a));
    }
}

package com.hc.strategy;

/**
 * @Auther: yingliming
 * @Date: 2022/6/18 0018 - 06 - 18 - 22:53
 * @Description: com.hc.strategy
 * @Version: 1.0
 **/
public class CatWeightMyComparable implements MyComparator<Cat>{


    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.weight < o2.weight) return -1 ;
        else if(o1.weight > o2.weight) return 1 ;
        else return 0;

    }
}

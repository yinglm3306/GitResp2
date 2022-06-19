package com.hc.strategy;

/**
 * @Auther: yingliming
 * @Date: 2022/6/18 0018 - 06 - 18 - 22:43
 * @Description: com.hc.strategy
 * @Version: 1.0
 **/
public class DogMyComparator implements MyComparator<Dog> {


    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.food < o2.food) return  -1;
        else if(o1.food > o2.food) return  1;
        else  return 0;
    }
}

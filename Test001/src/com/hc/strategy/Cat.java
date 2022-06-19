package com.hc.strategy;

/**
 * @Auther: yingliming
 * @Date: 2022/6/18 0018 - 06 - 18 - 17:18
 * @Description: com.hc.strategy
 * @Version: 1.0
 **/
public class Cat implements MyComparable<Cat> {
    int weight, height;

    public  Cat(int weight, int height){
        this.weight= weight;
        this.height=height;
    }

    public  int compareTo(Cat cat){
        if(this.weight< cat.weight) return -1;
        else  if(this.weight > cat.weight) return  1;
        else  return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}

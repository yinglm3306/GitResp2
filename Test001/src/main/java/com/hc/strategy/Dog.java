package com.hc.strategy;

/**
 * @Auther: yingliming
 * @Date: 2022/6/18 0018 - 06 - 18 - 21:34
 * @Description: com.hc.strategy
 * @Version: 1.0
 **/
public class Dog implements MyComparable<Dog> {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog dog) {
        if(this.food < dog.food) return -1;
        else if(this.food > dog.food) return 1;
        else  return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}

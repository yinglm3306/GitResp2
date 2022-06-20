package com.hc.strategy;

/**
 * @Auther: yingliming
 * @Date: 2022/6/17 0017 - 06 - 17 - 19:43
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Sorter<T> {

    public void sort(T[] a, MyComparator<T> myComparator) {
        for(int i=0;i<a.length; i++){
            int minPos = i;
            for(int j=i+1; j<a.length;j++){
             minPos = myComparator.compare(a[j],a[minPos])==-1 ? j: minPos;
            }

            Mswap(a,minPos,i);


        }
    }

    void Mswap(T[] arr,int i,int j){
        T temp ;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


}

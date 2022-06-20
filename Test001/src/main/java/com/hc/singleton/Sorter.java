package com.hc.singleton;

/**
 * @Auther: yingliming
 * @Date: 2022/6/17 0017 - 06 - 17 - 19:43
 * @Description: com.hc.singleton
 * @Version: 1.0
 **/
public class Sorter {

    public void sort(int[] a) {
        for(int i=0;i<a.length; i++){
            int minPos = i;
            for(int j=i+1; j<a.length;j++){
             minPos = a[minPos]>a[j] ? j: minPos;
            }

            Mswap(a,minPos,i);


        }
    }

    public void Mswap(int[] arr,int i,int j){
        int temp ;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


}

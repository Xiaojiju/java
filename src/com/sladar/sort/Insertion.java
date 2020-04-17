package com.sladar.sort;

import com.sladar.BaseCompare;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/11 1:33
  * @desc 插入排序
  * 原理： 假设数组为一个有序数组，取无序数组中的第i个元素在数组中插入，在i+1个元素插入的时候跟第i个元素进行比较，如果小于就进行交换位置；
  *       后面的元素依次进行比较插入，遍历n-1次后结束；
  * 适用场景： 小规模数据并且数据基本有序的情况下，更为高效；
  */
public class Insertion extends BaseCompare {

    @Override
    public void sort(int[] comparable) {
        int len = comparable.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0 && less(comparable[j], comparable[j - 1]); j--) {
                exch(comparable, j,j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] temp = {8,0,9,4,2,1,3,5,5,6,7,8,0,9,2,3,4,5,7,0,9,7,4,2,3,5,7,6,8,0,3,2,1};
        Insertion insertion = new Insertion();
        insertion.sort(temp);
        System.out.println(isSort(temp));
        show(temp);
    }
}

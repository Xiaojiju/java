package com.sladar.sort;

import com.sladar.BaseCompare;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/11 1:37
  * @desc 选择排序
  * 原理： 将无序数组的第i个元素与剩下n-i个 元素进行对比，进而达到排序的结果；
  * 使用场景： 小规模的数据，选择排序>插入>冒泡
  */
public class Selection extends BaseCompare {

    @Override
    public void sort(int[] comparable) {
        // sorting ascending
        int len = comparable.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (less(comparable[j], comparable[min])) {
                    min = j;
                }
            }
            exch(comparable, i, min);
        }
    }

    public static void main(String[] args) {
        int[] temp = {2,5,6,1,4,2,7,8};
        Selection selection = new Selection();
        selection.sort(temp);
        System.out.println(isSort(temp));
        show(temp);
    }
}

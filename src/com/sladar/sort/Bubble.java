package com.sladar.sort;

import com.sladar.BaseCompare;

/**
 * @description bubble sort
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/31 12:32
 */
public class Bubble extends BaseCompare {

    @Override
    public void sort(int[] comparable) {
        int len = comparable.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (less(comparable[j], comparable[j - 1])) {
                    exch(comparable, j, j -1);
                }
            }
        }
    }

    /**
     * 优化冒泡
     * @param arr
     */
    private void bunbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int len = arr.length - 1;
        boolean flag = true; // 如果数组是有序的，就不需要排序
        for (int i = 0; i < len && flag; i++) {
            flag = false;
            for (int j = 0; j < len - i; j++) { // 每次比较后，将最大的数都放到最后，这样就比较len - i次；
                if (less(arr[j + 1], arr[j])) {
                    exch(arr, j, j + 1);
                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] temp = {8,0,9,4,2,1,3,5,5,6,7,8,0,9,2,3,4,5,7,0,9,7,4,2,3,5,7,6,8,0,3,2,1};
        Bubble bubble = new Bubble();
        bubble.sort(temp);
        System.out.println(isSort(temp));
        show(temp);
    }
}

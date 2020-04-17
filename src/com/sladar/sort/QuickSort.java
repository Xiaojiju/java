package com.sladar.sort;

import com.sladar.BaseCompare;
/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/11 0:59
  * @desc 快速排序
  * 快速排序主要使用使用双指针来确定数组中的某个元素的正确下标，然后重复的遍历确认好的下标的左右部分，进行排序；
  */
public class QuickSort extends BaseCompare {

    @Override
    public void sort(int[] comparable) {
        if (comparable.length < 2) {
            return;
        }
        quickSort(comparable, 0, comparable.length - 1);
    }

    /**
     * 快速排序地柜遍历
     * @param arr
     * @param lo
     * @param hi
     */
    private void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int cur = getIndex(arr, lo, hi);
            quickSort(arr, lo, cur - 1);
            quickSort(arr, cur + 1, hi);
        }
    }
    /**
     * 获取数组的某一元素的下标
     * @param arr 数组
     * @param lo 低位指针
     * @param hi 高位指针
     * @return 下标
     */
    private int getIndex(int[] arr, int lo, int hi) {

        int temp = arr[lo];
        while (lo < hi) {
            while (lo < hi && arr[hi] >= temp) {
                hi--;
            }
            arr[lo] = arr[hi];
            while (lo < hi && arr[lo] <= temp) {
                lo++;
            }
            arr[hi] = arr[lo];
        }
        arr[lo] = temp;
        return lo;
    }

    public static void main(String[] args) {
        int[] test = {4, 2, 54, 12, 54, 76, 8, 0, 7, 43, 21, 3, 1, 65, 43};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(test);
        System.out.println(isSort(test));
        show(test);
    }
}

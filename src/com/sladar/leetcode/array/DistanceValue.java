package com.sladar.leetcode.array;

import java.util.Arrays;

/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/7 17:54
  * @desc 给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。
  *
  * 「距离值」 定义为符合此描述的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= d 。
  * Example 1:
  *
  * Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
  * Output: 2
  * Explanation:
  * For arr1[0]=4 we have:
  * |4-10|=6 > d=2
  * |4-9|=5 > d=2
  * |4-1|=3 > d=2
  * |4-8|=4 > d=2
  * For arr1[1]=5 we have:
  * |5-10|=5 > d=2
  * |5-9|=4 > d=2
  * |5-1|=4 > d=2
  * |5-8|=3 > d=2
  * For arr1[2]=8 we have:
  * |8-10|=2 <= d=2
  * |8-9|=1 <= d=2
  * |8-1|=7 > d=2
  * |8-8|=0 <= d=2
  */
public class DistanceValue {
    /**
     * 暴力破解
     * 便利arr1的所有值和arr2的所有值进行绝对值比较
     * @param arr1
     * @param arr2
     * @param d
     * @return 执行结果：
     * 通过
     * 显示详情
     * 执行用时 :
     * 4 ms
     * , 在所有 Java 提交中击败了
     * 87.27%
     * 的用户
     * 内存消耗 :
     * 39.7 MB
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            int modify = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) > d) {
                    modify++;
                } else {
                    break;
                }
            }
            if (modify == arr2.length) {
                count++;
            }
        }
        return count;
    }

    /**
     * 二分法进行比较；
     * 思路：题中表明只要满足小于等于d的|arr1[i] - arr2[j]|,然后返回arr1的索引即可，那么找出arr2中的最接近arr1[i]的
     * 值，计算一次绝对值，如果大于d，就直接下一层，避免了很多不必要的计算；将问题就快哟直接转化成在arr2中插入arr1[i],
     * 只需要找到最接近的数字即可；
     * @param arr1
     * @param arr2
     * @param d
     * @return
     */
    public int findTheDistanceValueByBinary(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int hi = arr2.length - 1;
        int count = 0;
        for(int i : arr1){
            int index = binarySearch(arr2, 0, hi, i);
            if(index == 0){
                if(Math.abs(arr2[index] - i) > d)
                    count++;
            } else if(index == hi + 1) {
                if(Math.abs(arr2[hi] - i) > d)
                    count++;
            } else {
                if(Math.abs(arr2[index] - i) > d && Math.abs(arr2[index - 1] - i) > d)
                    count++;
            }
        }
        return count;
    }

    private int binarySearch(int[] arr, int lo, int hi, int target){
        while(lo <= hi){
            int mid = (hi - lo) / 2 + lo;
            if(arr[mid] < target) lo = mid + 1;
            else if(arr[mid] > target) hi = mid - 1;
            else return mid;
        }
        return lo;
    }
}

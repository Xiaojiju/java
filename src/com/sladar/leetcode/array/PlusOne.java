package com.sladar.leetcode.array;
/**
  * @author Erys Mo 
  * @date 2021/8/27
  * @time 17:03
  * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
  *
  * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
  *
  * 你可以假设除了整数 0 之外，这个整数不会以零开头。
  *
  * 来源：力扣（LeetCode）
  * 链接：https://leetcode-cn.com/problems/plus-one
  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  **/
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        for (int i = len; i >= 0; i--) {
            digits[i] ++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 2];
        digits[0] = 1;
        return digits;
    }
}

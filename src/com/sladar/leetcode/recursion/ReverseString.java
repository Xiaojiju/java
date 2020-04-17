package com.sladar.leetcode.recursion;
/**
 * @description
 * 344. 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time ${Date}
 */
public class ReverseString {

    public void reverseString(char[] s) {
        helper(0, s);
    }

    private void helper(int index, char[] s) {
        if (s == null || index >= s.length) {
            return;
        }
        helper(index + 1, s);
        System.out.print(s[index]);
    }

    public static void main(String[] args) {
        String temp = "123456789";
        ReverseString rs = new ReverseString();
        rs.reverseString(temp.toCharArray());
    }
}

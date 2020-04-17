package com.sladar.leetcode;

/**
 * 204. 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 效率提升的关键在于埃拉托斯特尼筛法，简称埃式筛，也叫厄拉多塞筛法：
 * 要得到自然数n以内的全部质数，必须把不大于根号n的所有质数的倍数剔除，剩下的就是质数。
 */
public class Prime {

    public static int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        boolean[] isPrimes = new boolean[n + 1];
        isPrimes[0] = isPrimes[1] = true;

        int count = 0;
        for (int i = 2; i * i< n; i++) {
            if (!isPrimes[i]) {
                for (int j = i * i; j < n; j += i) {
                    if (isPrimes[j]) {
                        continue;
                    }
                    count++;
                    isPrimes[j] = true;
                }
            }
        }

        return n - count - 2;
    }

    public static void main(String[] args) {
        int test = 46412546;
        System.out.print(Prime.countPrimes(test));
    }
}

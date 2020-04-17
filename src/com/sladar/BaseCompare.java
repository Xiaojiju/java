package com.sladar;

/**
 * tips: this is the base class for sorting function,It contains the swap position
 * function, compare size function, check whether it is a positive order function
 * and print each element function in the array;
 * the class using int array as base comparable element, if you want to do a compare
 * method on Object, u can implements Comparable ${ @see Comparable.Class }
 * @Author create by MoYang
 * @Time 2019-13-30 23:29
 * @Email xiaojiju0811@163.com
 */
public abstract class BaseCompare {
    /**
     * sort array
     * @param comparable enable compare element array
     */
    public abstract void sort(int[] comparable);

    /**
     * compare two array
     * @param v
     * @param w
     * @return
     */
    public static boolean less(int v, int w) {
        return v < w;
    }

    /**
     * exchange position
     * @param comparable
     * @param i
     * @param j
     */
    public static void exch(int[] comparable, int i, int j) {
        int t = comparable[i];
        comparable[i] = comparable[j];
        comparable[j] = t;
    }

    /**
     * print each element in array
     * @param comparable
     */
    public static void show(int[] comparable) {
        for (int i = 0; i < comparable.length; i++) {
            System.out.print(comparable[i] + " ");
        }
        System.out.println();
    }

    /**
     * check position order
     * @param comparable
     * @return
     */
    public static boolean isSort(int[] comparable) {
        for (int i = 1; i < comparable.length; i++) {
            if (less(comparable[i], comparable[i - 1])) {
                return false;
            }
        }
        return true;
    }
}

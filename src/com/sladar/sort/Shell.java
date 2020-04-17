package com.sladar.sort;

import com.sladar.BaseCompare;

/**
 * shell sorting
 * this sorting function is base on insertion sorting, compare to insertion, it can be used on
 * large data array;
 */
public class Shell extends BaseCompare {

    @Override
    public void sort(int[] comparable) {
        for(int gap=comparable.length/2;gap>0;gap/=2){
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for(int i=gap;i<comparable.length;i++){
                int j = i;
                while(j-gap>=0 && less(comparable[j], comparable[j - gap])) {
                    //插入排序采用交换法
                    exch(comparable , j,j-gap);
                    j-=gap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] temp = {8,0,9,4,2,1,3,5,5,6,7,8,0,9,2,3,4,5,7,0,9,7,4,2,3,5,7,6,8,0,3,2,1};
        Shell shell = new Shell();
        shell.sort(temp);
        System.out.println(isSort(temp));
        show(temp);
    }
}

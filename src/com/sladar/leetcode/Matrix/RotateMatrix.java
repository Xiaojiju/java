package com.sladar.leetcode.Matrix;
/**
  * @author Erys Mo
  * @email xiaojiju0811@163.com
  * @date 2020/4/7 17:02
  * @desc Given an image represented by an N x N matrix,
  *       where each pixel in the image is 4 bytes, write a method to rotate the
  *       image by 90 degrees. Can you do this in place?
  *       旋转矩阵
  *       给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
  *       不占用额外内存空间能否做到？
  *示例 1:
  *
  * 给定 matrix =
  * [
  *   [1,2,3],
  *   [4,5,6],
  *   [7,8,9]
  * ],
  *
  * 原地旋转输入矩阵，使其变为:
  * [
  *   [7,4,1],
  *   [8,5,2],
  *   [9,6,3]
  * ]
  *
  */
public class RotateMatrix {
    /**
     * 解题思路：先进行左下和右上进行翻转，然后将数组中点翻转；没有额外的空间使用
     * @param matrix 矩阵
     */
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int mid = len >> 1;
        for (int q = 0; q < len; q++) {
            for (int w = 0; w < mid; w++) {
                int temp = matrix[q][w];
                matrix[q][w] = matrix[q][len - w - 1];
                matrix[q][len - w - 1] = temp;
            }
        }
        for (int z = 0; z < len; z++) {
            for (int k = 0; k < len; k++) {
                System.out.print(matrix[z][k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotate(arrays);
    }
}

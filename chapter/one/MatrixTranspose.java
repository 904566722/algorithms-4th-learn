//package com.hhhqqq.chapter.one;

/**
 * 1.1.13 编写一段代码，打印出一个M行N列的二维数组的转置（交换行和列 ）
 * @ClassName MatrixTranspose
 * @Description TODO
 * @Author HHQ
 * @Date 2020/3/30 23:56
 * @Version 1.0
 */
public class MatrixTranspose {
    public static int[][] matrixTranspose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] resMatrix = new int[cols][rows];

        for (int col=0; col<cols; col++) {
            for (int row=0; row<rows; row++) {
                resMatrix[col][row] = matrix[row][col];
            }
        }

        return resMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        // matrix after transposing
        int[][] resMatrix = matrixTranspose(matrix);

        for (int row=0; row<resMatrix.length; row++) {
            for (int col=0; col<resMatrix[0].length; col++) {
                System.out.print(resMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

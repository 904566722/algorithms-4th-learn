//package com.hhhqqq.chapter.one;

/**
 * 1.1.11 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出 行号和列号
 * @Author HHQ
 * @Date 2020/3/30 0:21
 * @Version 1.0
 */
public class PrintBooleanMatrix {

    public static void printBooleanMatrix(boolean[][] booleans) {
        for (int colNum=0; colNum<booleans[0].length; colNum++)
            System.out.print("\t" + (colNum+1));
        System.out.println();

        for (int i=0; i<booleans.length; i++){
            System.out.print((i+1) + "\t");
            // 打印矩阵
            for (int j=0; j<booleans[i].length; j++){
                if (booleans[i][j]) {
                    System.out.print("*" + "\t");
                }
                else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] booleans = {
                {false,false,true,true},
                {true,true,true,false},
                {true,true,true,true},
                {true,false,true,false},
        };
        printBooleanMatrix(booleans);
    }
}

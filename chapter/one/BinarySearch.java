//package com.hhhqqq.codes;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 1.1.10 二分查找
 * @Author HHQ
 * @Date 2020/3/29 3:19
 * @Version 1.0
 */
public class BinarySearch {

    public static int binarySearch(int value, int[] nums){
        int low = 0;
        int high = nums.length;

        while (low <= high) {
            int mid = low + (high-low)/2;
            if (value < nums[mid]) high = mid - 1;
            else if (value > nums[mid]) low = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        //从文件读入一列白名单整数
        //int[] whiteList = In.readInts(args[0]); //会提示使用了过时的API
        int[] whiteList = new In(args[0]).readAllInts();
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            //如果不存在白名单中则打印
            if (binarySearch(value, whiteList)<0) {
                StdOut.println(value);
            }
        }
    }
}

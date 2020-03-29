//package com.hhhqqq.codes;

/**
 * 1.1.3 编写一个程序，从命令行得到三个整数参数，如果它们都相等打印 equal ， 否则打印 not equal
 * @ClassName ThreeNumCompare
 * @Description TODO
 * @Author HHQ
 * @Date 2020/3/29 23:52
 * @Version 1.0
 */
public class ThreeNumCompare {

    public static boolean threeNumCompare(int[] nums) {
        if (nums[0]==nums[1] && nums[1]==nums[2]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        int i = 0;

        for (String item:args){
            nums[i++] = Integer.valueOf(item);
        }

        System.out.println(threeNumCompare(nums) ? "equal" : "not equal");
    }
}

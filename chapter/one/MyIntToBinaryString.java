//package com.hhhqqq.chapter.one;

/**
 * 1.1.9 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
 * @Author HHQ
 * @Date 2020/3/30 0:12
 * @Version 1.0
 */
public class MyIntToBinaryString {

    public static String myIntToBinaryString(int num) {
        String s = "";
        for (int n=num; n>0; n/=2) {
            s = n%2 + s;
        }
        return s;
    }

    public static void main(String[] args) {
        int num = Integer.valueOf(args[0]);
        System.out.println(num + "的二进制表示：" + myIntToBinaryString(num));
    }
}

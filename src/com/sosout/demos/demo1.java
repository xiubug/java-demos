package com.sosout.demos;

/**
 * Created by 　sosout on 2017/10/26.
 */
public class demo1 {
    /*
    * 功能：判断一个数（小于10位数）的位数
    */
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        if (num >= 0 && num <= 999999999) {
            while (num != 0) {
                count++;
                num/=10;
            }
            System.out.println("他是个" + count + "位数");
        } else {
            System.out.println("输入有误！");
        }
    }
}

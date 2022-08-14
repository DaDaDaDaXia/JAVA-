/*
* 二分法查找：
*   二分法查找基于已经排好序的数组。
*   （参与查找的第一个元素下标+参与查找的最后一个元素下标）/2为中间元素，
*   用中间元素与要查找的之进行比较，以此确定要查找的值在前一半数据中还是后一半数据中，
*   如果咋后一半数据中，则（中间元素下标+1 + 参与查找的最后一个元素下标）/2为新的中间元素，
*   然后循环上述步骤，直至找到要查找的数据。
*
* */
package com.tz.java1;

import java.util.Scanner;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int a1 = 0;  // 开始下标
        int a2 = arr.length-1;  // 结束下标
        Scanner sca = new Scanner(System.in);
        System.out.println("输入要查找的值：");
        int b = sca.nextInt();

        while (a1 <= a2){
            if (arr[0] > b || arr[arr.length-1] < b){
                System.out.println(b+"不在数组中。");
                break;
            }else if (arr[(a1 + a2)/2] == b){
                System.out.println("下标是："+(a1 + a2)/2);
                break;
            } else if (arr[(a1 + a2)/2] > b) {
                a2 = (a1 + a2)/2 - 1;
            } else {
                a1 = (a1 + a2)/2 + 1;
            }
        }
    }
}

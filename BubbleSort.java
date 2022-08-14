/*
 * 冒泡排序算法：
 *   拿着第一个数据与右边相邻的第二个数据进行比较，如果第一个位置的数据>第二个位置的数据，交换位置，否则位置不变。
 *   拿着第二个数据与右边相邻的第三个数据进行比较，如果第一个位置的数据>第二个位置的数据，交换位置，否则位置不变。
 *   以此进行比较，这一轮比较结束之后最大的数据就在最右边了。
 *   在重复上述步骤，知道完成排序。
 * */
package com.tz.java1;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {  // 只需要进行n - 1轮比较。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = 0;
                    a = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = a;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }

}

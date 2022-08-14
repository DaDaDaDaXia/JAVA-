/*
 * 选择排序：
 *   选择排序比冒泡排序的效率高，因为交换的次数少。
 *   每次从数据中找到最小值，
 *   将最小值与参与比较的所有数据的最前面的值交换位置。
 *
 *   关键点：找出最小值。
 * */

package com.tz.java1;

public class SeletSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        for (int i = 0; i<arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j<arr.length; j++){
                if (arr[min] > arr[j]){
                    min = j;  // min里放的是参与比较的最小值的下标。
                }
            }
            int a = arr[min];
            arr[min] = arr[i];
            arr[i] = a;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}

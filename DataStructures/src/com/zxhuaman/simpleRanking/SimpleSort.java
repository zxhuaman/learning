package com.zxhuaman.simpleRanking;

import java.util.Arrays;

/**
 * Created by zxhuaman on 2018/7/9.
 */
public class SimpleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(array, i, index);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        array[i] = array[i] + array[j] - (array[j] = array[i]);
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 78, 1, 9, 8, 10, 43, 11};
        //bubbleSort(a);
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}

package com.zxhuaman.array;

/**
 * Created by zxhuaman on 2018/6/26.
 */
public class BinarySearch {
    public static final int[] ARRAY = {1, 6, 7, 9, 10, 13, 30, 32, 88, 90, 101, 300, 409};

    public static void main(String[] args) {
        for (int target : ARRAY) {
            int index = binarySearch(ARRAY, target);
            if (index < 0) {
                System.out.println(String.format("No %d", target));
            } else {
                System.out.println(String.format("ARRAY[%d]=%d", index, target));
            }
        }
    }

    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int min = 0;
        int max = array.length - 1;
        int center;
        while (true) {
            center = (min + max) / 2;
            if (array[center] == target) {
                return center;
            } else if (min > max) {
                return -1;
            } else {
                if (array[center] < target) {
                    min = center + 1;
                } else {
                    max = center - 1;
                }
            }
        }
    }
}

package com.zxhuaman.array;

import com.zxhuaman.Common;

import java.util.Random;

/**
 * Created by zxhuaman on 2018/6/26.
 */
public class OrderedArray implements Common<Integer> {
    private int[] array;
    private int size = 0;

    public OrderedArray(int length) {
        this.array = new int[length];
    }

    @Override
    public boolean insert(Integer e) {
        //判断书否插满数据
        if (size == length()) {
            return false;
        }

        int i = 0;
        for (; i < size; i++) {
            if (array[i] > e) {
                break;
            }
        }

        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = e;
        size++;
        return true;
    }

    @Override
    public boolean delete(Integer e) {
        int index = find(e);
        if (index < 0) {
            return false;
        }
        for (int i = index; index < (size - 1); i++) {
            array[i] = array[i + 1];
        }
        size++;
        return true;
    }

    @Override
    public int find(Integer target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int min = 0;
        int max = size - 1;
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

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append(" ");
        }
        sb.insert(0, "[");
        sb.replace(sb.length() - 1, sb.length(), "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        OrderedArray array = new OrderedArray(19);
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            System.out.println(array.insert(i + random.nextInt(i + 1)));
        }
        System.out.println(array.toString());
    }
}

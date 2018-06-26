package com.zxhuaman.array;

import com.zxhuaman.Common;

/**
 * Created by zxhuaman on 2018/6/25.
 */
public class CustomArray<T extends Object> implements Common<T> {
    private int size;
    private Object[] container;
    private int length;

    public CustomArray(int length) {
        this.length = length;
        container = new Object[length];
        size = 0;
    }

    @Override
    public boolean insert(T e) {
        if (size < length) {
            container[size] = e;
            size += 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(T e) {
        for (Object o : container) {
            if (o == e || o.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int find(T e) {
        for (int i = 0; i < size; i++) {
            Object o = container[i];
            if (e == o || e.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomArray<String> array = new CustomArray<>(100);
        array.insert("hello");
        array.insert("world");
        System.out.println(array.length());
        System.out.println(array.size());
        System.out.println(array.find("world"));
    }
}

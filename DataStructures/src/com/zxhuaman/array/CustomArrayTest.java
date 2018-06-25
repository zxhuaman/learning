package com.zxhuaman.array;

import com.zxhuaman.Common;

/**
 * Created by zxhuaman on 2018/6/25.
 */
public class CustomArrayTest {
    public static void main(String[] args) {
        CustomArray<String> array = new CustomArray<>(100);
        array.insert("hello");
        array.insert("world");
        System.out.println(array.length());
        System.out.println(array.size());
        System.out.println(array.find("world"));
    }
}

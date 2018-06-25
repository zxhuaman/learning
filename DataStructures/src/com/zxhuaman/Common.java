package com.zxhuaman;

/**
 * Created by zxhuaman on 2018/6/25.
 */
public interface Common<T> {
    boolean insert(T e);
    boolean delete(T e);
    int find(T e);
    int length();
    int size();
}

package com.zxhuaman.stack;

/**
 * Created by zxhuaman on 2018/8/28.
 */
public interface IStack<T> {
    boolean push(T e);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
}

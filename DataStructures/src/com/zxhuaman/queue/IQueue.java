package com.zxhuaman.queue;

/**
 * Created by zxhuaman on 2018/9/1.
 */
public interface IQueue<T> {
    boolean enqueue(T e);

    T dequeue();

    T peek();

    boolean isEmpty();

    boolean isFull();
}

package com.zxhuaman.queue;

import java.util.Arrays;

/**
 * 循环队列
 */
public class Queue<T> implements IQueue<T> {
    protected Object[] mArray;
    protected int mMax;
    protected int rear;//队尾
    protected int front;
    protected int mItemCount = 0;

    public Queue(int max) {
        this.mMax = max;
        mArray = new Object[mMax];
        front = -1;
        rear = -1;
    }

    public boolean enqueue(T e) {
        if (mItemCount == mMax) {
            return false;
        }

        if (rear == mMax - 1) {
            rear = -1;
        }

        mItemCount++;
        mArray[++rear] = e;
        return true;
    }

    public T dequeue() {
        if (mItemCount > 0) {
            mItemCount--;
            if (front == mMax - 1) {
                front = -1;
            }
            return (T) mArray[++front];
        }
        return null;
    }

    public T peek() {
        if (mItemCount > 0) {
            return (T) mArray[rear];
        }
        return null;
    }

    public boolean isEmpty() {
        return mItemCount == 0;
    }

    public boolean isFull() {
        return mItemCount == mMax;
    }

    @Override
    public String toString() {
        return Arrays.toString(mArray);
    }
}

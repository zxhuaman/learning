package com.zxhuaman.queue;

/**
 * Created by zxhuaman on 2018/9/1.
 */
public class PriorityQueue<T> extends Queue<T> {

    public PriorityQueue(int max) {
        super(max);
    }

    @Override
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
}

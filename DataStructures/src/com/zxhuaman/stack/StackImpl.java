package com.zxhuaman.stack;

import java.util.Arrays;

/**
 * Created by zxhuaman on 2018/8/28.
 */
public class StackImpl<T> implements IStack<T> {
    private int mMaxCount;
    private int mSize;
    private Object[] mArray;

    public StackImpl(int mMaxCount) {
        this.mMaxCount = mMaxCount;
        mSize = -1;
        mArray = new Object[mMaxCount];
    }


    @Override
    public boolean push(T e) {
        if (mSize < mMaxCount - 1) {
            mArray[++mSize] = e;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        if (mSize > -1) {
            return (T) mArray[mSize--];
        }
        return null;
    }

    @Override
    public T peek() {
        if (mSize > -1) {
            return (T) mArray[mSize];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return mSize == -1;
    }

    @Override
    public boolean isFull() {
        return mSize == mMaxCount - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(mArray);
    }
}

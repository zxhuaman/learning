package com.zxhuaman;

/**
 * Created by zxhuaman on 2018/6/25.
 */
public interface Common<T> {
    boolean insert(T e);
    boolean delete(T e);
    int find(T e);

    /**
     * 获取容器长度
     * @return 容器长度
     */
    int length();

    /**
     * 获取容器中的元素个数
     * @return 元素个数
     */
    int size();
}

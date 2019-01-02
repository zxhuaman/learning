package com.zxhuaman.queue;

/**
 * Created by zxhuaman on 2018/8/29.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(20);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int j = 0; j < 4; j++) {
            System.out.println(queue.dequeue());
        }

        for (int k = 0; k < 20; k++) {
            queue.enqueue(k + 10);
        }

        System.out.println(queue.toString());
    }
}

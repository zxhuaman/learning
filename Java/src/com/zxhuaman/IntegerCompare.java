package com.zxhuaman;

/**
 * Created by zxhuaman on 2018/6/21.
 */
public class IntegerCompare {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        Integer k = 1;

        System.out.println("i==j ? " + (i == j));
        System.out.println("i.equals(j) ? " + (i.equals(j)));
        System.out.println("i==1 ? " + (i == 1));
        System.out.println("i.equals(1) ? " + i.equals(1));

        System.out.println("k == 1 ? " + (k==1));
        System.out.println("k == i ? " + (k==i));
        System.out.println("k.equals(i) ? " + k.equals(i));

    }
}

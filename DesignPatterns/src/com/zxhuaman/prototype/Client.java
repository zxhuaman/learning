package com.zxhuaman.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static final int UPPER_LIMIT = 1000;

    public static void main(String[] args) {
        Order order = new CorporateOrder();
        order.setCount(9055);

        List<Order> orders = new ArrayList<>();
        while (order.getCount() > 1000) {
            try {
                Order o = (Order) order.clone();
                o.setCount(UPPER_LIMIT);
                order.setCount(order.getCount() - UPPER_LIMIT);
                orders.add(o);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        if (order.getCount() > 0) {
            orders.add(order);
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}

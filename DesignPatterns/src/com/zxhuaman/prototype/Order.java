package com.zxhuaman.prototype;

public class Order implements Cloneable {
    private int count;
    private String name;

    public Order() {
    }

    public Order(int count, String name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Order order = (Order) super.clone();
        order.setName(this.name);
        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}

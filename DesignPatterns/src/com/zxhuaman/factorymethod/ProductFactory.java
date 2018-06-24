package com.zxhuaman.factorymethod;

/**
 * Created by zxhuaman on 2018/6/23.
 */
public abstract class ProductFactory {
    public boolean produce() {
        System.out.println("生产了一台" + factory().getType());
        return true;
    }
    protected abstract Product factory();
}

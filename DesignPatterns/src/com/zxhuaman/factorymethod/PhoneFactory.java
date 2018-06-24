package com.zxhuaman.factorymethod;

/**
 * Created by zxhuaman on 2018/6/23.
 */
public class PhoneFactory extends ProductFactory {
    @Override
    protected Phone factory() {
        return new Phone();
    }
}

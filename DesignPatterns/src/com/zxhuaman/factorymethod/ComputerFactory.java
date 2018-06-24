package com.zxhuaman.factorymethod;

/**
 * Created by zxhuaman on 2018/6/23.
 */
public class ComputerFactory extends ProductFactory {
    @Override
    protected Computer factory() {
        return new Computer();
    }
}

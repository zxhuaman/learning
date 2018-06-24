package com.zxhuaman.factorymethod;

/**
 * Created by zxhuaman on 2018/6/23.
 */
public class Client {
    public static void main(String[] args) {
        ProductFactory phone = new PhoneFactory();
        for (int i=0; i<5; i++) {
            phone.produce();
        }

        ProductFactory computerFactory = new ComputerFactory();
        for (int j=0; j<10; j++) {
            computerFactory.produce();
        }
    }
}

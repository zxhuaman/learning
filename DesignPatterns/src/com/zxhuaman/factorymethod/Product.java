package com.zxhuaman.factorymethod;

/**
 * Created by zxhuaman on 2018/6/23.
 */
public class Product {
    private ProductType type;
    private String name;
    private String brand;

    public Product() {
    }

    public Product(ProductType type) {
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product(ProductType type, String name, String brand) {
        this.type = type;
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}

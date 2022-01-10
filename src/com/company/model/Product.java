package com.company.model;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;
    private String SKU;
    private Integer initialNumber;

    public Product(String name, Double price, String SKU, Integer initialNumber) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
        this.initialNumber = initialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Integer getInitialNumber() {
        return initialNumber;
    }

    public void setInitialNumber(Integer initialNumber) {
        this.initialNumber = initialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", SKU='" + SKU + '\'' +
                ", initialNumber=" + initialNumber +
                '}';
    }
}

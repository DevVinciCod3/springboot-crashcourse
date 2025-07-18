package com.example.myfirstapi.model;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private double price;

    //Constructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Getter
    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    //Setter

    public void setId(long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }


}
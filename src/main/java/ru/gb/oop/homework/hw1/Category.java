package ru.gb.oop.homework.hw1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private Product product1;
    private Product product2;
    private Product product3;
    public List<Product> productList = new ArrayList<>(3);


    public Category(String name, Product product1, Product product2, Product product3) {
        this.name = name;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;

    }

    protected List<Product> getProductList(Product product1, Product product2, Product product3) {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }

    public void printProductList() {
        System.out.println(getProductList(product1, product2, product3));
    }
    public void whatInMag(){
        System.out.println(productList);
    }
}

package ru.gb.oop.homework.hw1;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int maxBuys = 5;
    private int counter;
    private Product product;
    public List<Product> buyList = new ArrayList<>(maxBuys);

    public List<Product> productIn(Product product) {
        if (counter < maxBuys) {
            System.out.println("Кладем товар в сумку");
            buyList.add(product);
            counter++;
        } else {
            System.out.println("Больше товара не поместится, приходите в другой раз");
        }
        return buyList;
    }
}

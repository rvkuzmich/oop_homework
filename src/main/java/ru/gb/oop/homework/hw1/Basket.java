package ru.gb.oop.homework.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {
    private final int maxToBuy = 5;
    private int counter;
    private Product product;
    public List<Product> toBuyList = new ArrayList<>(maxToBuy);

    public Basket() {
    }

    public List<Product> buyProduct(Product product, Category category) {
        if (counter < maxToBuy) {
            System.out.println("Кладем товар в корзину");
            toBuyList.add(product);
            category.productList.remove(product);
            counter++;
        } else {
            System.out.println("Больше товара не поместится, приходите в другой раз");
        }
        return toBuyList;
    }

    public List<Product> productOut(Product product, Category category) {
        if (counter > 0) {
            System.out.println("Выкладываем товар из корзины");
            toBuyList.remove(product);
            category.productList.add(product);
            counter--;
        } else {
            System.out.println("В корзине больше нет товара");
        }
        return toBuyList;
    }
    public void whatInside() {
        System.out.println(toBuyList);
    }
}

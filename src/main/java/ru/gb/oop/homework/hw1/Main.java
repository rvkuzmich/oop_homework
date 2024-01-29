package ru.gb.oop.homework.hw1;
// Кузьмич Роман. Группа Разработчик | Программист | 25.10.23
public class Main {
    public static void main(String[] args) {
        User user1 = new User("Вася");
        User user2 = new User("Петя");
        User user3 = new User("Коля");
        Product soap1 = new Product("Мыло душистое", 3.55, 3.9);
        Product soap2 = new Product("Мыло жидкое", 5.95, 3.4);
        Product soap3 = new Product("Мыло банное", 8.55, 4.9);
        Product butter1 = new Product("Масло мягкое", 38.40, 3.1);
        Product butter2 = new Product("Масло кремлевское", 29.90, 2.9);
        Product butter3 = new Product("Масло сливочное", 19.75, 4.3);
        Product sugar1 = new Product("Сахар белый песок", 80.95, 4.9);
        Product sugar2 = new Product("Сахар коричневый песок", 130.25, 4.2);
        Product sugar3 = new Product("Сахар рафинад", 115.35, 3.7);
        Category soap = new Category("Хозтовары", soap1, soap2, soap3);
        soap.printProductList();
        Category butter = new Category("Масло", butter1, butter2, butter3);
        butter.printProductList();
        Category sugar = new Category("Сахар", sugar1, sugar2, sugar3);
        sugar.printProductList();
        user1.basket.buyProduct(soap1, soap);
        user1.basket.buyProduct(soap2, soap);
        user1.basket.buyProduct(sugar1, sugar);
        user1.basket.buyProduct(sugar2, sugar);
        user1.basket.buyProduct(sugar3, sugar);
        user1.basket.buyProduct(butter1, butter);
        user1.basket.productOut(sugar3, sugar);
        user1.basket.buyProduct(butter1, butter);
        user1.basket.whatInside();
        sugar.whatInMag();
        soap.whatInMag();
        butter.whatInMag();
    }
}

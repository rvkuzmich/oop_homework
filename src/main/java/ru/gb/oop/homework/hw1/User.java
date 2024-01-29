package ru.gb.oop.homework.hw1;

import java.util.List;

public class User {
    private String userName;
    private String password;
    protected Basket basket = new Basket();
    private int counter = 5;

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }
}

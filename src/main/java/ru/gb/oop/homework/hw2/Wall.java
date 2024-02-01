package ru.gb.oop.homework.hw2;

public class Wall extends Obstacle{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}

package ru.gb.oop.homework.hw2;

import java.util.*;

public abstract class Obstacle {
    protected int distance;
    protected double height;
    private int id = 1;

    public int getDistance() {
        return distance;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obstacle obstacle = (Obstacle) o;
        return id == obstacle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

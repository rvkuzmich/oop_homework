package ru.gb.oop.homework.hw2;

public abstract class Creature {
    protected int maxRunDistance;
    protected double maxJumpHeight;
    protected final String name;
    protected boolean status;
    public Creature(String name) {
        this.name = name;
    }
    protected abstract void run(int distance);
    protected abstract void jump(double height);

    public Creature(int maxRunDistance, double maxJumpHeight, String name, boolean status) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
        this.status = status;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

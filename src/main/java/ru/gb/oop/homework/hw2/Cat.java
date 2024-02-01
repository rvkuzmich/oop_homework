package ru.gb.oop.homework.hw2;

public class Cat extends Live {
    public Cat(String name, int maxRunDistance, double maxJumpHeight, boolean status) {
        super(name);
        super.setMaxRunDistance(maxRunDistance);
        super.setMaxJumpHeight(maxJumpHeight);
        super.setStatus(status);
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " успешно пробежал дистанцию!");
        } else {
            System.out.println(this.name + " не смог пробежать дистанцию! Кот устал и выбывает!");
            this.setStatus(false);
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(this.name + " успешно перепрыгнул препятствие!");
        } else {
            System.out.println(this.name + " не смог перепрыгнуть препятствие! Кот устал и выбывает!");
            this.setStatus(false);
        }
    }
}

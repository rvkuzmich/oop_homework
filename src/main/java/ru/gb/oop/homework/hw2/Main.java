package ru.gb.oop.homework.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Treadmill testT = new Treadmill(200);
        List<Obstacle> obstacleList = new ArrayList<>(Arrays.asList(
                new Treadmill(rand.nextInt(300)),
                new Wall(rand.nextDouble(0.89)),
                new Treadmill(rand.nextInt(800)),
                new Wall(rand.nextDouble(1.34)),
                new Treadmill(rand.nextInt(1300)),
                new Wall(rand.nextDouble(2.04)),
                new Treadmill(rand.nextInt(2000)),
                new Wall(rand.nextDouble(3.65)),
                new Treadmill(rand.nextInt(4000))
        ));
        List<Creature> creatureList = new ArrayList<>(Arrays.asList(
                new Human("Сергей", 1500, 1.28, true),
                new Human("Роман", 1800, 0.97, true),
                new Human("Николай", 800, 0.52, true),
                new Cat("Кеша", 3500, 2.89, true),
                new Cat("Тиша", 3300, 3.32, true),
                new Robot("Василий", 2800, 5.36, true)
        ));

        for (Creature creature : creatureList) {
            System.out.println(creature.getName() + " выходит на дистанцию");
            for (Obstacle obstacle : obstacleList) {
                if (creature.isStatus()) {
                    if (obstacle.equals(testT)) {
                        System.out.println("obstacle.getDistance() = " + obstacle.getDistance());
                        creature.run(obstacle.getDistance());
                    } else {
                        System.out.println("obstacle.getHeight() = " + obstacle.getHeight());
                        creature.jump(obstacle.getHeight());
                    }
                }

            }
        }
    }
}

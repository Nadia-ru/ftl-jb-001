package tasks;


import tasks.task018.Ball;
import tasks.task018.Box;
import tasks.task018.Cylinder;
import tasks.task018.Shape;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(200);
        Cylinder c1 = new Cylinder(3,2);
        Ball ball = new Ball(3);
        System.out.println(b1.getVolume());
        System.out.println(c1.getVolume());
        System.out.println(ball.getVolume());
        System.out.println(b1.add(c1));
        System.out.println(b1.add(ball));
        System.out.println(b1.add(c1));


    }
}


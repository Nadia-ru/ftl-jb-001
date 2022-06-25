package tasks.task018;

import tasks.Main;

public class Ball extends SolidOfRevolution{
    public Ball(double radius) {
        super(radius);
        this.volume =(4.0/3)* Math.PI *radius*radius*radius;
    }
}

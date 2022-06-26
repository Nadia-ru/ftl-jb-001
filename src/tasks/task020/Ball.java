package tasks.task020;

public class Ball implements SolidOfRevolution{
    private double radius;
    private double volume;
    public Ball(double radius) {
        this.radius =radius;
        this.volume =(4.0/3)* Math.PI *radius*radius*radius;
    }
    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getRadius() {
        return this.radius;
    }
}

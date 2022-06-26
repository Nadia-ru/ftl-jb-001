package tasks.task020;

public class Cylinder implements SolidOfRevolution{
    private double height;
    private  double radius;
    private double volume;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.volume = this.getRadius()*this.getRadius()*Math.PI*this.getHeight();
    }

    public double getHeight() {
        return height;
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

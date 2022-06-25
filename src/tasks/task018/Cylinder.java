package tasks.task018;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = this.getRadius()*this.getRadius()*Math.PI*this.getHeight();
    }

    public double getHeight() {
        return height;
    }
}

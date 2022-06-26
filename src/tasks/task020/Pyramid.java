package tasks.task020;

public class Pyramid implements Shape{
    private double s;
    private double h;
    private double volume;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = s*h*1.0/3;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}

package tasks.task018;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = s*h*1.0/3;
    }
}

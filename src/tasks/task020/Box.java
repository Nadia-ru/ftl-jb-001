package tasks.task020;

import java.util.ArrayList;

public class Box implements Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double usedVolume = 0;
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape s) {
        if (s.getVolume() > (this.getVolume() - this.usedVolume)) {
            return false;
        }
        shapes.add(s);
        this.usedVolume += s.getVolume();
        return true;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }
}

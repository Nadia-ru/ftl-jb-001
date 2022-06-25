package tasks.task018;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double usedVolume = 0;

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
}

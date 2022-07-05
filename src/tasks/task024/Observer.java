package tasks.task024;
import tasks.task023.MyStringBuilder;

import java.util.LinkedList;
import java.util.List;

public class Observer {
    private List<Observer> observers;
    private StringBuilder newStrB;

    public void update (StringBuilder newStrB){
        MyStringBuilder newMyStrB = new MyStringBuilder(newStrB);
    };




    public Observer() {
        observers = new LinkedList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(newStrB);
    }
    public void setMeasurements(StringBuilder s) {
        this.newStrB = s;
        notifyObservers();
    }
}

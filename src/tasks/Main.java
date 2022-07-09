package tasks;

import tasks.task031.Task031;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        Thread t = new Thread(new Task031());
        Thread t2 = new Thread(new Task031());
        t.setName("Первый");
        t2.setName("Второй");
        t.start();
        t2.start();
        Thread.yield();


    }
}


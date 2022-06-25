package tasks;

import tasks.task015.RandomNumber;

public class Main {
    public static void main (String[] args) {
        RandomNumber k = new RandomNumber(
                new int[]{ 1, 2, 3 },
                new int[]{ 3, 1, 5 }
        );
        for (int i=0;i<100;i++) {
            System.out.println(k.getRandomWeighted());
        }
    }
}


package tasks;

import tasks.task015.RandomNumber;
import tasks.task016.Task016;
import tasks.task017.Task017;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double ans = Task017.run();
        System.out.println();
        System.out.println(" RUN= " + ans);
        System.out.println(Task017.equation(ans));

        System.out.println();
        System.out.println();
        System.out.println();

        double ans2 = Task017.run2(0, 10);
        System.out.println();
        System.out.println("RUN2= " + ans2);
        System.out.println(Task017.equation(ans2));
    }
}


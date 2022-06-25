package tasks;

import tasks.task015.RandomNumber;
import tasks.task016.Task016;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var N = 100_000_000;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = 1;
        }
        array[9900_971] = 3;
        Arrays.sort(array);

        var perebor0 = System.currentTimeMillis();
        boolean b1 = Task016.containsPerebor(array, 3);
        var perebor1 = System.currentTimeMillis();
        System.out.println(perebor1 - perebor0 + "ms");

        boolean b2 = Task016.containsPerebor(array, 7);
        var perebor2 = System.currentTimeMillis();
        System.out.println(perebor2 - perebor1 + "ms");

        System.out.println(b1 + " " + b2);

        var binary0 = System.currentTimeMillis();
        boolean b3 = Task016.containsBinary(array, 3);
        var binary1 = System.currentTimeMillis();
        System.out.println(binary1 - binary0 + "ms");

        boolean b4 = Task016.containsBinary(array, 7);
        var binary2 = System.currentTimeMillis();
        System.out.println(binary2 - binary1 + "ms");

        System.out.println(b3 + " " + b4);
    }
}


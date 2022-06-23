package tasks;


import tasks.task001.Task001;
import tasks.task002.Task002;
import tasks.task003.Task003;
import tasks.task004.Task004;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        Task004.run(num);
        in.close();
    }
}

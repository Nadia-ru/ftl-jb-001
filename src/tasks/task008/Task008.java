package tasks.task008;

import java.util.ArrayList;

public class Task008 {
    public static void run() {
        int[] myArray = new int[2];
        myArray[0] = 1;
        myArray[1] = 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int x: myArray) {
            al.add(x);
        }
        for(int i =2;i<=11;i++){
            int newEl = al.get(i-1)+al.get(i-2);
            al.add(newEl);
        }
    for(int r:al) {
        System.out.printf("%d ", r);
    }

    }

}

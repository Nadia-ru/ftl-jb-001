package tasks.task013;


import java.util.ArrayList;

public class Task013 {

    public static void run() {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(51);
        numList.add(14);
        numList.add(11);
        numList.add(21);
        numList.add(21);
        numList.add(21);
        numList.add(21);
        numList.add(12);
        numList.add(31);
        numList.add(21);
        numList.add(21);
        numList.add(21);

        System.out.println("Оригинал: " + numList.toString());
        Integer i = 21;
        for (int j =0;j<numList.size()+1;j++) {
            numList.remove(i);
        }
        System.out.println("Новый список: " + numList.toString());
    }
}

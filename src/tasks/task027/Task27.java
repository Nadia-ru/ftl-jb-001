package tasks.task027;

import java.util.List;

public class Task27 {
    public static <T> void addArrayList(List<Integer> list){
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static void randomElement(List<Integer> list){
        for (int i = 0; i < 10_000; i++) {
            int min = 0;
            int max = list.size() - 1;
            int x = (int) (Math.random() * ((max - min) + 1)) + min;
            list.get(x);
        }
    }
}

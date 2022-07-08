package tasks;

import tasks.task025.Filter;
import tasks.task025.Task25;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        Filter f = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof Integer) {
                    return ((int)o % 2) == 0;
                }
                return false;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(-1);
        list.add(0);
        Task25.filter(list, f);
        System.out.println(list);

    }
}


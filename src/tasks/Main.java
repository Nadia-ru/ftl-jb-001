package tasks;

import tasks.task025.Filter;
import tasks.task026.Task26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(5);
        list.add(5);
        list.add(-1);
        list.add(0);
        System.out.println(Task26.deleteDuplicate(list));

    }
}


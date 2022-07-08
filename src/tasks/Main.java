package tasks;

import tasks.task025.Filter;
import tasks.task026.Task26;
import tasks.task027.Task27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long g1 =System.currentTimeMillis();
        Task27.addArrayList(list);
        long g2 = System.currentTimeMillis();
        Task27.addArrayList(list2);
        long g3 = System.currentTimeMillis();
        System.out.println("add element. ArrayList:" + (g2-g1)
        +"ms. LinkedList:" + (g3-g2)+"ms");

        long f1 =System.currentTimeMillis();
        Task27.randomElement(list);
        long f2 = System.currentTimeMillis();
        Task27.randomElement(list2);
        long f3 = System.currentTimeMillis();
        System.out.println("rand element. ArrayList:" + (f2-f1)
                +"ms. LinkedList:" + (f3-f2)+"ms");

        /**
         * add element. ArrayList:65ms. LinkedList:169ms
         * rand element. ArrayList:3ms. LinkedList:13213ms
         */
    }
}


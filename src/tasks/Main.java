package tasks;


import tasks.task028.Task028;
import tasks.task029.Task29;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        Map<String,Integer> map = new HashMap<>();
        String[] seasons  = new String[] {"Winter", "Spring", "Spring", "Spring", "Summer","Summer","Summer","Summer","Summer", "Autumn"};
        map = Task29.arrayToMap(seasons);
        System.out.println(map);
    }
}


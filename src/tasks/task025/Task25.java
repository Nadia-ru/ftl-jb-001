package tasks.task025;

import java.util.ArrayList;
import java.util.List;

public class Task25 {
    public static <T> void filter(List<T> list, Filter filter){
        for (int i = list.size()-1; i >= 0; i--) {
            if (!filter.apply(list.get(i))) {
                list.remove(i);
            }
        }
    }
}

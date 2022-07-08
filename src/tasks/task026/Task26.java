package tasks.task026;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task26 {
    public static <T> Collection<T> deleteDuplicate(Collection<T> c) {
        return (Collection<T>) (new HashSet<T>(c));
    }
}

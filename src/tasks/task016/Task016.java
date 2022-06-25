package tasks.task016;

import java.util.Arrays;

public class Task016 {
    public static boolean containsPerebor(int[] haystack, int needle) {
        for (int h : haystack) {
            if (h == needle) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsBinary(int[] haystack, int needle){
//        Arrays.sort(haystack);
        int firstIndex = 0;
        int lastIndex = haystack.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (haystack[middleIndex] == needle) {
                return true;
            }
            else if (haystack[middleIndex] < needle)
                firstIndex = middleIndex + 1;
            else if (haystack[middleIndex] > needle)
                lastIndex = middleIndex - 1;

        }
        return false;
    }
}

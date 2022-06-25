package tasks.task015;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public int[] elements;
    public int[] weightsElements;

    public RandomNumber(int[] elements, int[] weightsElements) {
        this.elements = elements;
        this.weightsElements = weightsElements;
    }

    public int getRandomWeighted() {
        int len = 0;
        for (int x : this.weightsElements) {
            len += x;
        }
        int[] generatedArray = new int[len];
        int a = 0;
        for (int i = 0; i < this.weightsElements.length; i++) {
            for (int j = 0; j < this.weightsElements[i]; j++) {
                generatedArray[a] = this.elements[i];
                a++;
            }
        }

        Random rand = new Random();
        int min =0;
        int max = len-1;

        int randomNum = rand.nextInt((max - min) + 1) + min;
        return generatedArray[randomNum];
    }
}

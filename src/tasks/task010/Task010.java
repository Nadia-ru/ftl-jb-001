package tasks.task010;

public class Task010 {
    public static void run(){

        float[] array1 = new float[10];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (float) Math.random();
        }
        float minValue = array1[0];
        float maxValue = array1[0];
        float sumArray = 0;
        for(int i=0;i<array1.length;i++){
            if(array1[i] < minValue){
                minValue = array1[i];
            }
            if(array1[i]> maxValue){
                maxValue = array1[i];
            }
            sumArray += array1[i];
        }
        float srValue = sumArray/10;
        System.out.printf("max- %f, min -%f ,sr -%f",maxValue,minValue,srValue);
    }
}

package tasks.task011;

public class Task011 {
    public static void run(){

        float[] array1 = new float[10];


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (float) Math.random();
            System.out.printf("%f ",array1[i]);
        }
        for (int j = 1; j < array1.length; j++) {
            int F =0;
            for (int i=0; i< array1.length-j; i++){
                if(array1[i]>array1[i+1]){
                    float A = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = A;
                    F=1;
                }
            }
            if (F==0){
                break;
            }
        }
        System.out.println("");
        for (int i = 0; i < array1.length; i++) {

            System.out.printf("%f ",array1[i]);
        }

    }
}

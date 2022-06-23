package tasks.task006;


public class Task006 {

    public static void run() {
        double i = 1;
        int j=1;
        while (i<=512){
            System.out.printf("%.0f ",i);
            i = Math.pow(2,j);
            j++;
        }

    }
}

package tasks.task012;


public class Task012 {

    public static void run() {
        for (int i = 2; i < 100; i++){
            int n =0;
            for(int j =2;j<99;j++){
                if (i%j==0 && i!=j){
                    n=1;
                    break;
                }
            }
            if(n==0){
                System.out.println(i);
            }
        }
    }
}

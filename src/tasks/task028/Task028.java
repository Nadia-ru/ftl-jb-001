package tasks.task028;

public class Task028 {
    public static void iteratorDV(int line, int column,Object[][] array){
        for(int i=0;i<line;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

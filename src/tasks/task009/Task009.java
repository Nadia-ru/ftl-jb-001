package tasks.task009;

import java.util.Scanner;

public class Task009 {
    public static String run() {
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?" );
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.print("Ответ на загадку:");
            String otv = in.nextLine();
            switch(otv){
                case "Троллейбус":
                    String s ="Првильно!";
                    return s;

                case "Сдаюсь":
                    String s2 ="Правильный ответ: троллейбус." ;
                    return s2;


                default:
                    System.out.println("Подумай еще.");
                    break;
            }
        }
        String s3 ="Завершение программы" ;
        return s3;
    }
}

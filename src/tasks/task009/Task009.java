package tasks.task009;

import java.util.Scanner;

public class Task009 {
    public static String run() {
        System.out.println("��� ��� �����: �����, �������, � ����� � ��������� ����� �������?" );
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.print("����� �� �������:");
            String otv = in.nextLine();
            switch(otv){
                case "����������":
                    String s ="��������!";
                    return s;

                case "������":
                    String s2 ="���������� �����: ����������." ;
                    return s2;


                default:
                    System.out.println("������� ���.");
                    break;
            }
        }
        String s3 ="���������� ���������" ;
        return s3;
    }
}

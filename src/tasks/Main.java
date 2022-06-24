package tasks;



import com.company.animals.Dog;
import tasks.task014.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Vector v = new Vector(1.f,2.f,3.f);
        System.out.println(v.toString());
        double d = v.lengthVector();
        System.out.println(d);
        Vector v2 = new Vector(2.f,3.f,4.f);
        System.out.println(v.scalarProuzv(v2));
        Vector v3 = v.sumVectors(v2);
        Vector v4 = v.raznVectors(v2);
        System.out.println(v3);
        System.out.println(v4);
        List<Vector> vectors = Vector.randomArray(5);
        for (Vector i: vectors){
            System.out.println(i.toString());
        }
        Vector v5 = v.vectorProuzv(v2);
        System.out.println(v5.toString());
        double d2 = Vector.cosAngle(v,v2);
        System.out.println(d2);
    }
}

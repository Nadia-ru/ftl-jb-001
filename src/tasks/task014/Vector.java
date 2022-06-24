package tasks.task014;

import com.company.animals.Animal;
import com.company.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Vector {
    private Float x;
    private Float y;
    private Float z;

    public Vector(Float x, Float y, Float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double lengthVector(){
        double length = Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
        return  length;
    }
    public double scalarProuzv( Vector b){
        Float c=this.x*b.x;
        Float v=this.y*b.y;
        Float n=this.z*b.z;
        double prousv = c+v+n;
        return prousv;

    }
    public Vector vectorProuzv( Vector b){
        Float c=this.y*b.z-this.z*b.y;
        Float v=this.x*b.z-this.z*b.x;
        Float n=this.x*b.y- this.y*b.x;
        return new Vector(c,v,n);

    }
    public static double cosAngle(Vector a,Vector b){
        double f= a.scalarProuzv(b);
        double f2 = a.lengthVector()+b.lengthVector();
        return f/f2;
    }
    public Vector sumVectors( Vector b){
        Float c=this.x+b.x;
        Float v=this.y+b.y;
        Float n=this.z+b.z;
        return new Vector(c,v,n);

    }
    public Vector raznVectors( Vector b){
        Float c=this.x-b.x;
        Float v=this.y-b.y;
        Float n=this.z-b.z;
        return new Vector(c,v,n);

    }
    public static List<Vector> randomArray(Integer N){
        List<Vector> vectors = new ArrayList<>();
        for (int i=0;i<N;i++) {
            vectors.add(new Vector((float) Math.random(), (float) Math.random(), (float) Math.random()));
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

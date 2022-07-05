package tasks.task023;

public class MyStringBuilder {


    private StringBuilder controls = new StringBuilder();

    public MyStringBuilder(StringBuilder controls) {
        this.controls = controls;
    }

    public char charAt(int x){
        return this.controls.charAt(x);
    }
    public void setCharAt(int x, char a){
        this.controls.setCharAt(x, a);
    }

    public void reverse(){
        this.controls.reverse();
    }

    public String toString(){

        return this.controls.toString();
    }

    public StringBuilder replace(int x1,int x2, String z){
        return this.controls.replace(x1,x2,z);
    }

    public StringBuilder deleteCharAt(int x){
        return  this.controls.deleteCharAt(x);
    }

    public StringBuilder append(String x){
        return this.controls.append(x);
    }

    public int length()
    {
        return this.controls.length();
    }


}

package com.company.L020;

import com.company.animals.Dog;

public class TypeConversion {

    private static void runStringToByte(){
        Byte b1 = new Byte("10");
        System.out.println(b1);

        String str =  "111";

        Byte b2 = Byte.valueOf(str);
        System.out.println(b2);

        byte b =0;
        String str2 ="101";
        b = Byte.parseByte(str2);
        System.out.println(b);

        String str3 =  "20500";
        byte[] b3 = str3.getBytes();
        System.out.println(b3);

        String s = new String(b3);
        System.out.println(s);
    }

    private static void runStringToInt(){

        String str ="1234";
        Integer i1 =new Integer(str);
        Integer i2 = Integer.valueOf(str);
        Integer i3 =Integer.parseInt(str);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }

    private static void runStringToDouble(){
        Double d1 = new Double("1.2345");
        Double d2 = Double.valueOf("12.7e10");
        Double d3 = Double.parseDouble("4.4");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    private static void runStringToBoolean(){
        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("false");
        Boolean b3 = Boolean.valueOf("yes");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
    public static void run(){
        runStringToByte();
        runStringToInt();
        runStringToDouble();
    }
}

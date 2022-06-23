package com.company.L019;

import java.util.Locale;
import java.util.stream.Stream;

public class StringExample {

    private static String str(){
        return "Добро пожаловать в FoodTech School";
    }
    private static void runContentEquals(){
        System.out.println("runContentEquals");
        String str1 = "Добро пожаловать в FoodTech School";
        String str2 = "Сайт для изучения java";

        StringBuffer str3 = new StringBuffer("Добро пожаловать в FoodTech School");
        StringBuffer str4 = new StringBuffer("Сайт для изучения java");

        boolean result = str1.contentEquals(str3);
        System.out.println("str1 == str3 " + result);

        result = str2.contentEquals(str3);
        System.out.println("str2 == str3 " + result);

        result = str1.contentEquals(str4);
        System.out.println("str1 == str4 " + result);
    }

    public static void runEqualsIgnoreCase(){
        System.out.println("");
        System.out.println("runEqualsIgnoreCase");

        String str1 = "Добро пожаловать в FoodTech School";
        String str2 = str1;
        String str3 = "Сайт для изучения java";
        String str4 = "ДоБРО ПоЖаЛоВать в FOODTECh SchOOL";

        boolean res;
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));

    }

    public static void runCompareTo(){
        System.out.println("");
        System.out.println("runCompareTo");

        String str1 = "Я вызываю метод!";
        String str2 = "Я вызываю метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str1));
    }

    public static void runCompareToIgnoreCase(){
        System.out.println("");
        System.out.println("runCompareToIgnoreCase");

        String str1 = "Я вызываю метод!";
        String str2 = "Я Вызываю Метод!";
        String str3 = "Я Вызываю класс!";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str2.compareToIgnoreCase(str3));
        System.out.println(str3.compareToIgnoreCase(str1));
    }

    public static void runToLowerCase(){
        System.out.println("");
        System.out.println("runToLowerCase");
        String str1 = "Я вызываю метод!";
        System.out.println(str1.toLowerCase());
    }

    public static void runToUpperCase(){
        System.out.println("");
        System.out.println("runToUpperCase");
        String str1 = "Я вызываю метод!";
        System.out.println(str1.toUpperCase());
    }

    public static void runConcat(){
        System.out.println("");
        System.out.println("runConcat");
        String s = "Я вызываю метод!";
        s = s.concat(" и я вызываю класс");
        s = s + " String";
        System.out.println(s);
    }

    public static void runMatches(){
        System.out.println("");
        System.out.println("runMatches");
        String s = "Добро пожаловать в FoodTech School";
        System.out.println(s.matches("(.*)FoodTech(.*)"));
        System.out.println(s.matches("FoodTech"));
        System.out.println(s.matches("Добро(.*)"));
    }

    public static void runContains(){
        System.out.println("");
        System.out.println("runContains");
        String s = "twinkle twinkle little star";
        System.out.println(s.contains("little"));
        System.out.println(s.contains("54321"));
    }

    public static void runRegionMatches(){
        System.out.println("");
        System.out.println("runRegionMatches");

        String s1 = "Добро пожаловать на FoodTech School",
        s2 = "FoodTech School",
        s3 = "Java",
        s4 = "FOODTECH SCHOOL";
        System.out.println(s1.regionMatches(20,s2,0,8));
        System.out.println(s1.regionMatches(20,s3,0,8));
        System.out.println(s1.regionMatches(true,20,s4,0,8));
    }

    public static void runStartWith(){
        System.out.println("");
        System.out.println("runStartWith");

        String s1 = "Добро пожаловать на FoodTech School",
                s2 = "Добро ",
                s3 = "Java",
                s4 = "FOODTECH SCHOOL";
        System.out.println(s1.startsWith(s2));
        System.out.println(s1.startsWith(s3));
        System.out.println(s1.startsWith(s4));
    }

    public static void runEndWith(){
        System.out.println("");
        System.out.println("runEndWith");

        String s1 = "Добро пожаловать на FoodTech School",
                s2 = "School",
                s3 = "Java",
                s4 = "FOODTECH SCHOOL";
        System.out.println(s1.endsWith(s2));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.endsWith(s4));
    }

    public static void runLines(){
        System.out.println("");
        System.out.println("runLines");
        String s = "starda\n" +
                "stardf\n" +
                "astrafa\n" +
                "asrta\n" +
                "artss\n";
        System.out.println(s);
        Stream<String> lines = s.lines();
        lines.forEach(System.out::println);
        System.out.println(lines);
    }

    public static void runToCharArray(){
        System.out.println("");
        System.out.println("runToCharArray");

        String s1 = "Добро пожаловать на FoodTech School";
        System.out.println(s1.toCharArray()[4]);
    }

    public static void runFormat(){
        System.out.println("");
        System.out.println("runFormat");

        float floatVar = 1.2f;
        int intVar = 12;
        String stringVar = "String";
        String fs;
        fs = String.format("float =%.4f ,int =%d, string=%s",floatVar,intVar,stringVar);
        System.out.println(fs);
    }

    private static void runValueOf(){
        double d = 12312.2;
        boolean b =true;
        long l =111l;
        char[] chars = {'d','r'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(chars));
    }

    private static void runRepeat(){
        String str1 = "string";
        String repeat = str1.repeat(10);
        System.out.println(repeat);
    }

    private static void runIndexOf(){
        String str = str();
        String sub1 = "Food", sub2 = "Tech";

        System.out.println(str.indexOf(sub1));
        System.out.println(str.indexOf(sub2));
        System.out.println(str.indexOf("fds"));
    }

    private static void runLastIndexOf(){
        String str = str();
        String sub1 = "о";

        System.out.println(str.lastIndexOf(sub1));

    }

    private static void runSubString(){
        String str =str();
        System.out.println(str.substring(11,15));
    }

    private static void runSubSequense()
    {
        String str =str();
        System.out.println(str.subSequence(0,10));
    }


    private static void runSplit(){
        String str = "Добро-пожаловать-на-сайт";
        for(String s: str.split("-")){
            System.out.println(s);
        }
    }

    private static void runJoin(){
        String join = String.join(", ", "1","2","3");
        System.out.println(join);
    }

    private static void runTrim(){
        String str ="            String";
        System.out.println(str);
        System.out.println(str.trim());
    }

    private static void runReplace(){
        String s= str();
        System.out.println(s.replace("о","-"));
        System.out.println(s.replaceFirst("о","-"));
        System.out.println(s.replaceAll("о","-"));
    }
    public static void run(){
        runContentEquals();
        runEqualsIgnoreCase();
        runCompareTo();
        runCompareToIgnoreCase();
        runToLowerCase();
        runToUpperCase();
        runConcat();
        runMatches();
        runContains();
        runRegionMatches();
        runStartWith();
        runEndWith();
        runLines();
        runToCharArray();
        runFormat();
        runValueOf();
        runRepeat();
        runIndexOf();
        runLastIndexOf();
        runSubString();
        runSubSequense();
        runSplit();
        runJoin();
        runTrim();
        runReplace();
    }
}

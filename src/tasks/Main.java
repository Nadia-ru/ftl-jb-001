package tasks;



import tasks.task022.BaseConverter;
import tasks.task022.TemperatureType;



public class Main {
    public static void main(String[] args)  {

        float c =BaseConverter.convert(-32.0F, TemperatureType.FAHRENHEIT);
        float c2 =BaseConverter.convert(20.0F, TemperatureType.KELVIN);
        System.out.println(c);
        System.out.println(c2);

    }
}


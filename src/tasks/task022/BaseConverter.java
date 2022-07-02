package tasks.task022;

import java.security.PublicKey;

public class BaseConverter {
    public static float convert(float valueConvertC, TemperatureType toUnit ){
        if(toUnit == TemperatureType.FAHRENHEIT){
            return (float) (valueConvertC*1.8 +32);
        }
        if(toUnit == TemperatureType.KELVIN){
            return (float) (valueConvertC+273.15);
        }
        return 0.0F;
    }
}

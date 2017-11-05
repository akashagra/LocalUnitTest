package com.example.avma1997.localunittest;

/**
 * Created by Avma1997 on 11/5/2017.
 */

public class ConvertorUtil {
    public static float convertCelciusToFarheniet(float celciustemp)
    {
        float farhenietTemperature=9*celciustemp/5+32;

                return farhenietTemperature;

    }
    public static float convertFarhenietToCelcius(float farheniettemp)
    {
        float celciustemp=5*(farheniettemp-32)/9;
        return  celciustemp;
    }
}

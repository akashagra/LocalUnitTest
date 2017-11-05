package com.example.avma1997.localunittest;

import org.junit.Test;
import com.example.avma1997.localunittest.ConvertorUtil;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Avma1997 on 11/5/2017.
 */

public class ConvertorUtilTest {

    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = ConvertorUtil.convertCelciusToFarheniet(100);
        // expected value is 212
        float expected = 212;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = ConvertorUtil.convertFarhenietToCelcius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected, actual, 0.001);
    }

}
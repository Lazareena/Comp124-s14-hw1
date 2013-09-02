package edu.macalester.comp124.hw1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConversionsTest {
    @Test
    public void testFahrenheitToCelcius() {
        assertEquals(  0, UnitConversions.fahrenheitToCelcius( 32  ), 0.00001);
        assertEquals( 37, UnitConversions.fahrenheitToCelcius( 98.6), 0.00001);
        assertEquals(100, UnitConversions.fahrenheitToCelcius(212  ), 0.00001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals( 32,   UnitConversions.celciusToFahrenheit(  0), 0.00001);
        assertEquals( 98.6, UnitConversions.celciusToFahrenheit( 37), 0.00001);
        assertEquals(212,   UnitConversions.celciusToFahrenheit(100), 0.00001);
    }
}

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
    @Test
    public void testMeterToInches() {
        assertEquals(  0, UnitConversions.meterToInches( 0 ), 0.00001);
        assertEquals( 196.85, UnitConversions.meterToInches( 5), 0.00001);
        assertEquals(1377.95, UnitConversions.meterToInches(35), 0.00001);
    }

    @Test
    public void testInchesToMeter() {
        assertEquals( 0,   UnitConversions.inchesToMeter(  0), 0.00001);
        assertEquals( 5, UnitConversions.inchesToMeter( 196.85), 0.00001);
        assertEquals(35,   UnitConversions.inchesToMeter(1377.95), 0.00001);
    }
}

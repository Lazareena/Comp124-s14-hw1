package edu.macalester.comp124.hw1;

public class UnitConversions {

    public static double fahrenheitToCelcius(double f) {

        double c = (5.0 * (f-32.0))/ 9.0;
        return c;
    }

    public static double celciusToFahrenheit(double c) {
       double f =((9.0/5.0)*c)+32.0;
       return f;

    }

    public static double meterToInches(double m){
       double i = (39.37)*m;
       return i;
    }

    public static double inchesToMeter(double i){
        double m= i/(39.37);
        return m;
    }
}

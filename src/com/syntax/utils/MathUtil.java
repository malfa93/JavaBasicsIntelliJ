package com.syntax.utils;

public class MathUtil {
        public static double trimDecimalNumber(double value, int decimalpoint)
        {
            // Using the pow() method
            value = value * Math.pow(10, decimalpoint);
            value = Math.floor(value);
            value = value / Math.pow(10, decimalpoint);
            System.out.println(value);
            return value;
        }

    public static void main(String[] args) {

            double db = 10.35827689;
        System.out.println(trimDecimalNumber(db,2));

    }

}

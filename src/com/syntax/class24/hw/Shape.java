package com.syntax.class24.hw;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.

    public void calculateArea(double num);

    public void calculatePerimeter(double num);

}

class Circle implements Shape{




    @Override
    public void calculateArea(double num) {

        double area = num * num * Math.PI;

        System.out.println("Area of Circle: "+area);

    }

    @Override
    public void calculatePerimeter(double num) {

        double perimeter = 2 * Math.PI * num;

        System.out.println("Perimeter of Circle: "+perimeter);

    }
}

class Square implements Shape{



    @Override
    public void calculateArea(double num) {

        double area = num*num;
        System.out.println("Area of Square: "+area);

    }

    @Override
    public void calculatePerimeter(double num) {

        double perimeter = 4*num;

        System.out.println("Perimeter of Square: "+perimeter);

    }
}

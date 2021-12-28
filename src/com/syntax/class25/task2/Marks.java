package com.syntax.class25.task2;

public abstract class  Marks {

    double course1Marks;
    double course2Marks;
    double course3Marks;

    public Marks(double course1Marks, double course2Marks, double course3Marks) {
        this.course1Marks = course1Marks;
        this.course2Marks = course2Marks;
        this.course3Marks = course3Marks;
    }

    abstract double getPrecentage();
}

class A extends Marks{
    public A(double course1Marks, double course2Marks, double course3Marks) {
        super(course1Marks, course2Marks, course3Marks);
    }

    @Override
    double getPrecentage() {
        return 0;
    }
}
//git hub!!
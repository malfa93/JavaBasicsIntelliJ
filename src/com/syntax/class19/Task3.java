package com.syntax.class19;

public class Task3 {

    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher();

        mt.name = "Demir";

        mt.teachMath();
    }


}

class Teacher {

    String name;

    void teach() {

        System.out.println("Teachers tech subjects");
    }


}

class MathTeacher extends Teacher {


    void teachMath() {

        System.out.println(name + " Teaches math");
    }

}

class ChemTeacher extends Teacher {


    void teachChem() {

        System.out.println(name + " Teaches math");
    }

}



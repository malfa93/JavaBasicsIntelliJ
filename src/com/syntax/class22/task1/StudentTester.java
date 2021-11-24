package com.syntax.class22.task1;

public class StudentTester {

    public static void main(String[] args) {

        Student[] students = {new Student(), new SyntaxStudent(),new CollegeStudents()};

        for(Student s:students){

            s.doHomework();
            s.study();
            s.practice();

            if(s instanceof SyntaxStudent){

                ((SyntaxStudent)s).doResearch();
            }
        }

    }



}

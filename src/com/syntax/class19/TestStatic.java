package com.syntax.class19;

public class TestStatic {


    static char thirdLetter(String s){

        char cstr='0';


        for(int i=0; i<=s.length()-1; i++){

            if(i%3==0){
                cstr=s.charAt(i);

            }



        }

        return cstr;

    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }


}

package com.syntax.review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {

        String path = "Files/Moe WPS.xlsx";

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

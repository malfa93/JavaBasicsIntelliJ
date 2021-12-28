package com.syntax.class31;

import com.syntax.utils.ConfigReader;
import com.syntax.utils.ExcelReader;

import java.io.IOException;

public class ExceptionDemo7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Important code");
        ExcelReader.read("Files/Moe WPS.xlsx","Sheet1");
        System.out.println("Important code");
    }
}

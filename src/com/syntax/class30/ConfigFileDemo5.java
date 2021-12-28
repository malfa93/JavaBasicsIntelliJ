package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("password"));
        properties.setProperty("URL","www.google.com");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream,"Added new property URL");
    }
}

package com.syntax.class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {
        //location of the file inside our project
        String path="Files/Moe.properties";


        // Creating properties to the object
        Properties properties = new Properties();
        // Adding new properties to the object
        properties.put("Username","Moe123");
        properties.put("Password","pas123");

        //Creating a connection to the folder or simple creating a new file
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //Storing the data inside the file
        properties.store(fileOutputStream, "creating a new file");

        fileOutputStream.close();




    }
}

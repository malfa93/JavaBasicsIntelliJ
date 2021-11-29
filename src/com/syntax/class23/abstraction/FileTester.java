package com.syntax.class23.abstraction;

public class FileTester {
    public static void main(String[] args) {

        File[] jv = {new JavaFile(), new PdfFile(), new WordFile()};

        for(File files:jv){

            files.editFile();
            files.closeFile();
            files.openFile();
        }


    }
}

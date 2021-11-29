package com.syntax.class23.abstraction;

public abstract class File {
//    Create a class File that will have the following behaviors:
//    open, edit, close.
//    Edit and close are implemented method while open is an abstract.
//    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
//    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc


    abstract void openFile();

    void editFile(){
        System.out.println("File is edited");
    }

    void closeFile(){
        System.out.println("File is closed");
    }
}

class JavaFile extends File{

    @Override
    void openFile() {
        System.out.println("To open Java File, you need Sublime Text");
    }
}

class WordFile extends File{

    @Override
    void openFile() {
        System.out.println("To open Word File, you need Microsoft Word");
    }
}

class PdfFile extends File{

    @Override
    void openFile() {
        System.out.println("To open PDF file, you need Adobe PDF Reader");
    }
}


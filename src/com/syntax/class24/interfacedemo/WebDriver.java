package com.syntax.class24.interfacedemo;

public interface WebDriver {

//    Create a WebDriver Interface that will have the following unimplemented behaviour:
//    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.

    public void openBrowser();
    public void closeBrowser();
    public void maximizeWindow();
    public void findElement();


}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {

        System.out.println("Open Chrome");

    }

    @Override
    public void closeBrowser() {

        System.out.println("Close Chrome");

    }

    @Override
    public void maximizeWindow() {

        System.out.println("Maximize Chrome's window");

    }


    @Override
    public void findElement() {

        System.out.println("Fine element in Chrome");


    }
}


class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {

        System.out.println("Open Firefox");

    }

    @Override
    public void closeBrowser() {

        System.out.println("Close Firefox");

    }

    @Override
    public void maximizeWindow() {

        System.out.println("Maximize Firefox's window");

    }


    @Override
    public void findElement() {

        System.out.println("Fine element in Firefox");


    }

}

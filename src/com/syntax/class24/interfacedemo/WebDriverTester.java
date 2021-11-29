package com.syntax.class24.interfacedemo;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] webDriver ={new ChromeDriver(), new FirefoxDriver()};

        for(WebDriver wd:webDriver){
            wd.openBrowser();
            wd.closeBrowser();
            wd.maximizeWindow();
            wd.findElement();
        }
    }
}

package com.mycompany.app;
// sanampreet
/**
 * Hello world!!
 */
public class App
{
//Sanampreet Mavan assignment
    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}

package com.xueyou.demo;

import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("appConfig");
        String c = resourceBundle.getString("app.encoding");
        System.out.println(c);

        String b = resourceBundle.getString("app.param2");
        System.out.println(b);
    }
}

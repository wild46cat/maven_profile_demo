package com.xueyou.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * Hello world!
 */
@Configuration
@ComponentScan(basePackages = {"com.xueyou.demo"})
@PropertySource(value = {"classpath:appConfig.properties"})
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.xueyou.demo.App.class);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        System.out.println(appConfig.getAppName());
        System.out.println(appConfig.getDriverName());
    }
}

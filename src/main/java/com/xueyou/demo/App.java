package com.xueyou.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


/**
 * Hello world!
 */
@Configuration
@ComponentScan(basePackages = {"com.xueyou.demo"})
@PropertySources({
//        @PropertySource("classpath:appConfig-dev.properties"),
        @PropertySource("classpath:appConfig-test.properties")
})
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.xueyou.demo.App.class);
        AppConfig appConfig = applicationContext.getBean(AppConfig.class);
        System.out.println(appConfig.getAppName());
        System.out.println(appConfig.getDriverName());
        System.out.println(appConfig.getProfileType());
    }
}

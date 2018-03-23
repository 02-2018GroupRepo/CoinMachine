package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class App
{


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
        ApplicationContext context = SpringApplication.run(App.class,args);

//        AbstractMachine machine = new DrinkMachine("Florida");
    }

}

package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import remote.SecurityCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication

public class App
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);

        SnackMachine snackMachine = new SnackMachine();

        snackMachine.startCoinBuffer();


    }

}

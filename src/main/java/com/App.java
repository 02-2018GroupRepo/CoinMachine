package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import remote.SecurityCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;



@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class App
{


    public static void main( String[] args ) {
      //  SpringApplication.run(App.class, args);
        ApplicationContext context = SpringApplication.run(App.class,args);

        AbstractMachine machine = new SnackMachine("Florida");



    }



}

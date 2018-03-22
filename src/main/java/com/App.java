package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import remote.SecurityCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@Configuration
@ComponentScan(basePackages = {"com"})
public class App
{

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);


    }



}

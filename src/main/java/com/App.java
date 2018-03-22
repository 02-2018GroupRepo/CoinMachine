package com;

import java.util.Scanner;

public class App
{


    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Option stuff");
        String option = scan.next();

        if(option.equals("operator")){
            SecurityCode security = new SecurityCode();
            System.out.println("Enter Security Code: ");
            String code = scan.next();

            if(security.checkPassword(code)){
                //operator stuff
            }
            else
                System.out.println("Your mother is a hamster & your father smells of elderberries");
        }
        else{
            //your machine stuff
        }


    }



}

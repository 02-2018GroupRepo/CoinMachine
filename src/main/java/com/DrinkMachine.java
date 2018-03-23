package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
@Component
@Qualifier("drink")
public class DrinkMachine extends AbstractMachine {


    protected LinkedList<Product>[][] machine;

    DrinkMachine() {
        super();
        //createLogFile();
    }

    void createRows(){
        machine = new LinkedList[5][];
        int columns;
        columns = 6;
        for (int i = 0; i < machine.length; i++) {
            if (i < 3) {
                machine[i] = new LinkedList[columns];
            }
            if (i >= 3) {
                columns = 5;
                machine[i] = new LinkedList[columns];
            }
            for (int j = 0; j < columns; j++) {
                machine[i][j] = new LinkedList<Product>();
            }
        }
    }
    void hardCodedMachineFiller() {
        Product can1 = new Product("Coca Cola", "patao", 3.50, .50);
        Product can2 = new Product("Sprite", "patao", 3.50, .50);
        Product can3 = new Product("Ginger Ale", "patao", 3.50, .50);
        Product can4 = new Product("Tomato Juice", "patao", 3.50, .50);


        Product bottle1 = new Product("Spring Water", "patao", 3.50, .50);
        Product bottle2 = new Product("Regular Water", "patao", 3.50, .50);
        Product bottle3 = new Product("Carbonated Water", "patao", 3.50, .50);
        Product bottle4 = new Product("Orange Juice", "patao", 3.50, .50);
        Product bottle5 = new Product("Apple Juice", "patao", 3.50, .50);
        Product bottle6 = new Product("Pomegranate Juice", "patao", 3.50, .50);


        machine[1][3].add(can1);
        machine[1][4].add(can2);
        machine[2][3].add(can3);
        machine[2][4].add(can4);
        machine[3][4].add(bottle1);
        machine[3][4].add(bottle2);
        machine[3][4].add(bottle3);
        machine[4][3].add(bottle4);
        machine[4][4].add(bottle5);
        machine[4][2].add(bottle6);
    }
}

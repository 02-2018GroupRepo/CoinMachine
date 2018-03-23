package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
@Component
@Qualifier("snack")
public class SnackMachine extends AbstractMachine {

//    public SnackMachine() {
//    }

    public SnackMachine() {
        super();



        //createLogFile();

    }

    public void displayInventory() {

        for (LinkedList[] row : machine) {
            System.out.println();
            for (LinkedList col : row) {
                if (col.size() > 0) {
                    Product p = (Product) col.peek();
                    System.out.print(p.name + " $" + p.retailPrice + " ");
                } else System.out.print("\t\t");
            }
        }
        System.out.println();

    }

    void hardCodedMachineFiller() {
        Product chips = new Product("BBQ", "patao", 3.50, .50);
        Product chips2 = new Product("Sea Salt", "patao", 3.50, .50);
        Product chips3 = new Product("Salt and Vinegar", "patao", 3.50, .50);
        Product chips4 = new Product("Pizza Chips", "patao", 3.50, .50);
        Product chips5 = new Product("Honey BBQ", "patao", 3.50, .50);
        Product chips6 = new Product("Plain", "patao", 3.50, .50);

        Product candy = new Product("Snicker", "patao", 3.50, .50);
        Product candy2 = new Product("Twix", "patao", 3.50, .50);
        Product candy3 = new Product("Dove", "patao", 3.50, .50);
        Product candy4 = new Product("Hersey", "patao", 3.50, .50);


        machine[1][3].add(chips);
        machine[1][4].add(chips2);
        machine[2][3].add(chips3);
        machine[2][4].add(chips4);
        machine[2][4].add(chips5);
        machine[4][4].add(candy2);
        machine[3][4].add(candy3);
    }

      void createRows() {
        int rows = 5;
        int columns = 5;
        machine = new LinkedList[rows][columns];


        //instantiate every slot vector of the vending machine to size 0 instead of null
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                machine[i][j] = new LinkedList<Product>();
            }
        }
    }

}

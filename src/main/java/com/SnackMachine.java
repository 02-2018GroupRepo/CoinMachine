package com;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
@Qualifier("snack")
public class SnackMachine extends AbstractMachine {


    public SnackMachine() {
        super();
        //createLogFile();
    }

    public void displayInventory() {
        System.out.println("Compartment\tName\tPrice");
        System.out.println("---------------------------------------");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (machine[row][col].size() > 0) {
                    char rowLetter;
                    switch (row) {
                        case 0:
                            rowLetter = 'A';
                            break;
                        case 1:
                            rowLetter = 'B';
                            break;
                        case 2:
                            rowLetter = 'C';
                            break;
                        case 3:
                            rowLetter = 'D';
                            break;
                        case 4:
                            rowLetter = 'E';
                            break;
                        default:
                            rowLetter = ' ';
                    }
                    Product p = machine[row][col].peek();
                    System.out.println(rowLetter + Integer.toString(col) + "\t\t\t" + p.name + "\t\t\t" + p.retailPrice);
                }
            }
        }
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


        machine[0][0].add(chips);
        machine[0][1].add(chips2);
        machine[1][0].add(chips3);
        machine[1][1].add(chips4);
        machine[2][0].add(chips5);
        machine[2][0].add(candy2);
        machine[2][1].add(candy3);
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

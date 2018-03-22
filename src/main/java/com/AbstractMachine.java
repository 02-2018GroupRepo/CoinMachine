package com;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Component
public abstract class AbstractMachine {

    //Instance variables
    static final String COMPANY = "Backpfeifengesicht";
    private Map<COINS, Integer> holdings = new HashMap<COINS, Integer>();
    private String myLocation;
    protected static int lastMachineID = 12345;
    private LinkedList<Product>[][] machine;
    private CoinBuffer coinBuffer;

    public enum COINS {
        NICKEL(.05), DIME(.10), QUARTER(.25);
        double value;

        COINS(double v) {
            value = v;
        }

        double getValue() {
            return value;
        }
    }

    //Constructor
    AbstractMachine() {
        holdings.put(COINS.NICKEL, 0);
        holdings.put(COINS.DIME, 0);
        holdings.put(COINS.QUARTER, 0);

    }

    //Getters
    public String getMyLocation() {
        return myLocation;
    }


    public double getMoneyAmount(){
        double total =0;
        for(Map.Entry<COINS, Integer> m : holdings.entrySet()){
            total+= m.getKey().getValue() * m.getValue();
        }
        return total;
    }

    // used to return each coin
    public Map getCoinAmount() {
//        for (Map.Entry<COINS, Integer> m : holdings.entrySet()) {
//            System.out.println(m.getKey() + ":\t\t" + m.getValue());
//        }
        return holdings;
    }

    //Methods
    public void addItem(String RowColumn, Product product) throws BADENTRY {
        char[] entry = RowColumn.toCharArray();
        int row;
        int col;
        switch (entry[0]) {
            case 'A':
                row = 0;
                break;
            case 'B':
                row = 1;
                break;
            case 'C':
                row = 2;
                break;
            case 'D':
                row = 3;
                break;
            case 'E':
                row = 4;
                break;
            default:
                throw new BADENTRY();
        }
        col = Character.getNumericValue(entry[1]);
        machine[row][col].add(product);
    }

    public double removeItem(String RowColumn, double runningTotal) throws BADENTRY, INSUFFICIENTFUNDS {
        char[] entry = RowColumn.toCharArray();
        int row;
        int col;
        switch (entry[0]) {
            case 'A':
                row = 0;
                break;
            case 'B':
                row = 1;
                break;
            case 'C':
                row = 2;
                break;
            case 'D':
                row = 3;
                break;
            case 'E':
                row = 4;
                break;
            default:
                throw new BADENTRY();
        }
        col = Character.getNumericValue(entry[1]);

        if (machine[row][col].isEmpty()) {
            throw new BADENTRY();
        }

        double price = 0;

        try {

            price = ((machine[row][col].peek()).retailPrice);

            if (price > runningTotal) {
                throw new INSUFFICIENTFUNDS();
            }

            machine[row][col].pop();

        } catch (ArrayIndexOutOfBoundsException ar) {
            throw new BADENTRY();

        }
        return runningTotal - price;
    }

    public void addQuarters(int quantity) {
        int currentQuantity = holdings.get(COINS.QUARTER);
        int newQuantity = currentQuantity + quantity;
        holdings.replace(COINS.QUARTER, newQuantity);
    }

    public void addDimes(int quantity) {
        int currentQuantity = holdings.get(COINS.DIME);
        int newQuantity = currentQuantity + quantity;
        holdings.replace(COINS.DIME, newQuantity);
    }

    public void addNickels(int quantity) {
        int currentQuantity = holdings.get(COINS.NICKEL);
        int newQuantity = currentQuantity + quantity;
        holdings.replace(COINS.NICKEL, newQuantity);
    }

    public void displayMoneyAmount() {
        double total = 0;
        for (Map.Entry<COINS, Integer> m : holdings.entrySet()) {
            System.out.println(m.getKey() + ":\t\t" + m.getValue());
            total += m.getKey().getValue() * m.getValue();
        }
        System.out.println("Total $:\t" + total);
    }

    public void changeLocation(String location) {
        this.myLocation = location;
    }

    //Abstract methods
    abstract void displayInventory();

    //Probably useless
    //returns a String of accepted coins
    public String getAcceptedCoins() {
        StringBuilder acceptable = new StringBuilder();
        for (COINS c : COINS.values()) {
            acceptable.append(c).append(" ");

        }
        return acceptable.toString();
    }

}

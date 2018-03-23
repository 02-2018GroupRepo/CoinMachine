package com

import spock.lang.Specification


class OperatorSpec extends Specification {

    def "Ask a vending machine the for the total money in machine"(){
        given: "A vending machine pre-loaded with 2.35 dollars"

        AbstractMachine vMachine = new DrinkMachine();

        when: "The operator calls getMoneyAmount()"
        String total = vMachine.getMoneyAmount();

        then:"The machine should return total amount of money inside the machine"
        total == "2.35";
    }

    def "Add quarters to a vending machine to increase the total amount"(){
        given: "A vending machine pre-loaded with 2.35 dollars"
        AbstractMachine vMachine = new SnackMachine();

        when: "The operator wants to add 4 Quarters"
        vMachine.addQuarters(4)
        and: "Get the total amount of money back in the machine"
        String total = vMachine.getMoneyAmount();

        then:"The machine should return total amount of money inside the machine increased by 4 quarters (1.00)"
        total == "3.35"
    }

    def "Add dimes to a vending machine to increase the total amount"(){
        given: "A vending machine pre-loaded with 2.35 dollars"
        AbstractMachine vMachine = new SnackMachine();

        when: "The operator wants to add 3 Dimes"
        vMachine.addDimes(3)
        and: "Get the total amount of money back in the machine"
        String total = vMachine.getMoneyAmount();

        then:"The machine should return total amount of money inside the machine increased by 3 dimes (0.30)"
        total == "2.65"
    }

    def "Add nickels to a vending machine to increase total amount"(){
        given: "A vending machine pre-loaded with 2.35 dollars"
        AbstractMachine vMachine = new SnackMachine();

        when: "The operator wants to add 2 nickels"
        vMachine.addNickels(2)
        and: "Get the total amount of money back in the machine"
        String total = vMachine.getMoneyAmount();

        then:"The machine should return total amount of money inside the machine increased by 2 nickels (0.10)"
        total == "2.45";
    }


    //get total coins per machine
    def "Get a map of each coin in the machine"(){
        given: "A vending machine pre-loaded with 2.35 dollars"
        AbstractMachine vMachine = new SnackMachine();

        when: "The operator wants to see the amount of each coin in the machine"
        Map coins = vMachine.getCoinAmount();

        then: "The machine should return a map of the coins and their amount"
        coins.get(AbstractMachine.COINS.NICKEL) == 5;
        coins.get(AbstractMachine.COINS.DIME) == 6;
        coins.get(AbstractMachine.COINS.QUARTER) == 6;
    }

    //change location test
}
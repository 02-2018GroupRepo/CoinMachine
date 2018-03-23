package com

import spock.lang.Specification


class RemoveItemSpec extends Specification {
    def"removing an item from vending machine when there is a product available for purchase and running total is sufficient for purchase"(){
        given: "a machine"
        AbstractMachine vendingMachine = new SnackMachine("GA");
        and: "a compartment, which consist of row and column name"
        String rowColumn = "C4";
        and: "initial running total"
        double runningTotal = 1.00;
        and: "number of products in a compartment"
        int size = vendingMachine.machine[2][4].size();
        when:"when the customer purchases the item"
        vendingMachine.removeItem(rowColumn, runningTotal);
        then:"Number of products in that compartment decreases by one"
        vendingMachine.machine[2][4].size()== size-1;
    }

    def"removing an item from vending machine when there are no products available for purchase"() {
        given: "a machine"
        AbstractMachine vendingMachine = new SnackMachine("GA");
        //stub this to create a machine with no products.
        and: "a compartment, which consist of row and column name"
        String rowColumn = "C4";
        and: "initial running total"
        double runningTotal = 1.00;
        when: "when the customer purchases the item"
        vendingMachine.removeItem(rowColumn, runningTotal);
        then: "Number of products in that compartment decreases by one"
        // throws BADENTRY
    }
}
package com

import spock.lang.Specification


class OperatorSpec extends Specification {

    def "Ask a vending machine the for the total money in machine"(){
        given: "A vending machine"
        AbstractMachine vMachine = new SnackMachine("Nigeria")
        vMachine.addNickels(2)
        vMachine.addDimes(4)
        vMachine.addQuarters(4)
        when: "The operator calls getMoneyAmount()"
        double total = vMachine.getMoneyAmount();
        then:"The machine should return total amount of money inside the machine"
        total == 1.50;
    }

}
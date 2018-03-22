package com

import spock.lang.Specification

class SecurityCodeSpec extends Specification{

    def "Security Code"(){
        given: "A login command"
        println "Enter Security Code"
        SecurityCode sec = new SecurityCode()

        when: "An Operator inserts correct code"
        String fun = "1234" //later will be user input, hard coding for testing purpose

        boolean valid = sec.checkPassword(fun) //validating if correct code

        then: "the Operator will have access to all vending machine functions"
        if(valid){
            println "Has access to functions"
        }
    }

}

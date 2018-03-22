package com;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MachineController {

    @Autowired
    private AbstractMachine abstractMachine;


    @RequestMapping("/requestMoneyAmount")
    public double requestMoneyAmount(){
        return abstractMachine.getMoneyAmount();
    }

    @RequestMapping("/requestCoinAmount")
    public Map requestCoinAmount(){
        return abstractMachine.getCoinAmount();
    }


/*    @RequestMapping("/pullLogFile")
    public String pullLogFile(){
        return abstractMachine.getLogFile();
    }*/
}



package com;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineController {

/*
    @Autowired
    private SnackMachine abstractMachine;

*/

    @RequestMapping("/requestMoneyAmount")
    public String requestMoneyAmount() {
        return SnackMachine.getMoneyAmount();
    }

    @RequestMapping("/requestCoinAmount")
    public Map requestCoinAmount() {
        return SnackMachine.getCoinAmount();
    }

    @RequestMapping("/changeLocation")
    public void changeLocation(@RequestParam(value = "newLocation") String location) {
        SnackMachine.changeLocation(location);

    }
/*    @RequestMapping("/pullLogFile")
    public String pullLogFile(){
        return abstractMachine.getLogFile();
    }*/

}



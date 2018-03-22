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

    // private static final String template = "Hello, %s!";
    //  private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/requestTotalMoney")
    public double requestTotalMoney(@RequestParam(value = "ID") String machineID) {
        return abstractMachine.getMoneyAmount();
    }

    @RequestMapping("/requestCoinsAmount")
    public Map requestCoinsAmount(@RequestParam(value = "ID") String machineID) {
        return abstractMachine.getCoinAmount();
    }

    @RequestMapping("/requestLogFile")
    public Map requestLogFile(@RequestParam(value = "ID") String machineID) {
        return abstractMachine.getCoinAmount();
    }

}

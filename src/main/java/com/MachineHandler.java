package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MachineHandler {

    Map<Integer, AbstractMachine> handler = new HashMap<Integer, AbstractMachine>();

    public void addMachine(AbstractMachine machine){
        handler.put(machine.myMachineID, machine);
    }

    public AbstractMachine findMachine(int key){
        return handler.get(key);
    }

    public ArrayList<Integer> findMachinesbyLocation(String location){
        ArrayList<Integer> foundMachines = new ArrayList<>();

        for(AbstractMachine object: handler.values()){
            if(object.myLocation.equals(location)){
                foundMachines.add(object.myMachineID);
            }
        }

        return foundMachines;
    }


}

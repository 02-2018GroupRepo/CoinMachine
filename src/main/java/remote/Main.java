package remote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.*;

import javax.swing.*;

public class Main {

    public static void main(String[] strings){

        ArrayList<String> validIDS = new ArrayList<String>();
        validIDS.add("1234");


        Map<String, String> machineLocations = new HashMap<>();

        machineLocations.put("some ip", "Florida");
        machineLocations.put("another ip", "Colorado");





        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String input = "";

        try
        {
            System.out.println("Input Operator ID");
            input= bufferedReader.readLine();
           // AbstractMachine abstractAction = new SnackMachine();
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}

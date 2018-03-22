package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;



public class Operator {

    static ArrayList<String> validIDS = new ArrayList<String>();
    int myMachineID;
    public void getLogFile(String employeeID) {

        if (validIDS.contains(employeeID)) {

            String log;
            String OS = System.getProperty("os.name").toLowerCase();
            if(OS.contains("windows")){
                log="logs\\";
            }else
            {
                log = "logs/";

            }
            String logPathName = log + myMachineID + ".txt";

            URL url = getClass().getResource(logPathName);
            File file = new File(url.getPath());

            try (BufferedReader reader = Files.newBufferedReader(file.toPath())){

                String line = null;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException x) {
                System.err.format("IOException: %s%n", x);
            } catch (NullPointerException n) {
                System.out.println("You must be using Windows you filthy animal?");
            }

        }

    }
}

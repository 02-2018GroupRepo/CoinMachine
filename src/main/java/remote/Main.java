package remote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static ArrayList<String> validIDS = new ArrayList<String>();
    private static Map<String, String> machineLocations = new HashMap<>();

    public static void main(String[] strings) {

        validIDS.add("1234");

        machineLocations.put("168", "Florida");
        machineLocations.put("another ip", "Colorado");

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));

        String input = "";

        try
        {
            int i = 0;
            while(i < 3){
                System.out.println("Input Operator ID: ");
                input= bufferedReader.readLine();
                // AbstractMachine abstractAction = new SnackMachine();
                if(validIDS.contains(input)){
                    //correct ID/Security Code
                    Operator opp = new Operator();
                    opp.getTotalMoneyByLocation("Florida", machineLocations);
                }else{
                    i += 1;
                    System.out.println("Sorry that ID is not valid, you have " + (3 - i) + " more attempt/s." );
                }
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}

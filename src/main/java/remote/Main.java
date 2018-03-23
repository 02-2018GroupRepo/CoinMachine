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

//        machineLocations.put("33", "Florida");
        machineLocations.put("73", "Florida");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        try {
            int i = 0;
            while (i < 3) {
                System.out.println("Input Operator ID: ");
                input = bufferedReader.readLine();
                // AbstractMachine abstractAction = new SnackMachine();
                if (validIDS.contains(input)) {
                    //correct ID/Security Code
                    i = 3;
                    Operator opp = new Operator();
                    System.out.println("Type your command: ");
                    while (!input.equals("DONE")) {
                        input = bufferedReader.readLine().toUpperCase();
                        switch (input) {
                            case "LOCATION AMOUNT":
                                System.out.println("What location?");
                                input = bufferedReader.readLine();
                                opp.getTotalMoneyByLocation(input, machineLocations);
                                break;
                            case "ID AMOUNT":
                                System.out.println("What is the machine ID?");
                                input = bufferedReader.readLine();
                                opp.sendMoneyCall(input);
                                break;
                            case "ID COIN":
                                System.out.println("What is the machine ID?");
                                input = bufferedReader.readLine();
                                opp.getCoinQuantity(input);
                            case "DONE":
                                break;
                            default:
                                System.out.println("Not a command, here are the commands:");
                                System.out.println("Location Amount - to get the amount of money per location.");
                                System.out.println("ID Amount - to get the amount of the money per machine.");
                                System.out.println("ID Coin - to get the number of coins per machine.");
                                System.out.println("Done - to exit");
                        }
                    }
                } else {
                    i += 1;
                    System.out.println("Sorry that ID is not valid, you have " + (3 - i) + " more attempt(s).");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

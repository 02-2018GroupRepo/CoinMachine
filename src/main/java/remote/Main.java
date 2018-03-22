package remote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.*;

import javax.swing.*;

public class Main {

    public static void main(String[] strings){

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

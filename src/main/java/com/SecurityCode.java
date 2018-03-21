package com;

public class SecurityCode {

    public boolean checkPassword(String fun){

        String valid = "1234";

        if(valid.equals(fun))
            return true;

        return false;
    }

}

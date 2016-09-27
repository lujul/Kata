package com.hbdriod.kata;

/**
 * Created by Human Booster on 27/09/2016.
 */

public class Calculator {


    //Method who makes a sum of an input String value
    public int add(String string) {
        if (string.equals("")) {
            return 0;
        } else {
            return Integer.parseInt(string);
        }


    }


}
